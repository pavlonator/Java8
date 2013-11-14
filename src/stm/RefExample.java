package stm;

import clojure.lang.LockingTransaction;
import clojure.lang.Ref;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Pavlo Cherkashyn
 */
public class RefExample {
    public static void main(String[] args) throws InterruptedException {
        Ref balance1 = new Ref(1000);
        Ref balance2 = new Ref(1000);
        final int howMuch = 50;


        ExecutorService es = Executors.newFixedThreadPool(10);
        es.execute(() -> {
            try {
                LockingTransaction.runInTransaction(new Callable() {
                    @Override
                    public Object call() throws Exception {
                        System.out.println("RefExample.call");
                        balance2.set((Integer) balance2.deref() + howMuch);

                        if ((Integer) balance1.deref() < howMuch) {
                            throw new IllegalStateException("no money");
                        }

                        balance1.set((Integer) balance1.deref() - howMuch);

                        return null;
                    }
                });
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        es.shutdown();
        Thread.sleep(5000);
        System.out.println(balance1.deref());
        System.out.println(balance2.deref());

    }
}
