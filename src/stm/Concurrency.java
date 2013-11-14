package stm;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Pavlo Cherkashyn
 */
public class Concurrency {
    public static void main(String[] args) throws InterruptedException {

        Account a1 = new Account(1000);
        Account a2 = new Account(1000);

        FinancialOperator op = new LockManagedOperator();


        Thread t1 = new Thread(getTarget(a1, a2, op));
        Thread t2 = new Thread(getTarget(a2, a1, op));
        Thread t3 = new Thread(getTarget(a2, a2, op));
        Thread t4 = new Thread(getTarget(a1, a1, op));
        t1.start();t2.start();t3.start();t4.start();
        Thread.sleep(2000);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());


    }

    private static Runnable getTarget(Account a1, Account a2, FinancialOperator op) {
        return () -> {
            for (int i = 0; i < 1000; i++)
                    op.transfer(a1, a2, 1);
        };
    }
}
