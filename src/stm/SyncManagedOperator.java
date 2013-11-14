package stm;

/**
 * @author Pavlo Cherkashyn
 */
public class SyncManagedOperator implements FinancialOperator {
    public void transfer(Account from, Account to, int howMuch) {
        synchronized (from) {
            synchronized (to) {
                from.withdraw(howMuch);
                to.deposit(howMuch);
            }
        }
    }
}
