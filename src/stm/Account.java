package stm;

/**
 * @author Pavlo Cherkashyn
 */
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public void withdraw(int howMuch){
        balance-=howMuch;
    }

    public void deposit(int howMuch){
        balance+=howMuch;
    }
}
