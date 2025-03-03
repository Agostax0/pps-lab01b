package e1;

public class BronzeBankAccount implements BankAccount {
    private final BankAccount base;

    public BronzeBankAccount(BankAccount bankAccount) {
        this.base = bankAccount;
    }

    @Override
    public int getBalance() {
        return base.getBalance();
    }

    @Override
    public void deposit(int amount) {
        base.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        base.withdraw(amount);
    }
}
