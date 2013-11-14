package stm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Pavlo Cherkashyn
 */
public class LockManagedOperator implements FinancialOperator {
    private final Lock txnLock = new ReentrantLock();


    // STM pattern  - separate state from identity
    // better menegeability, more flexible way to manage lock
    // no con
    @Override
    public void transfer(Account from, Account to, int howMuch) {
        try {
            if(txnLock.tryLock(1, TimeUnit.SECONDS)){
                from.withdraw(howMuch);
                to.deposit(howMuch);
            } else {
                System.err.println("could not get lock on transaction, will retry one again");
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            txnLock.unlock();
        }


    }
}
