package stm;

/**
 * @author Pavlo Cherkashyn
 */
public interface FinancialOperator {

    public void transfer(Account from, Account to, int howMuch);

}
