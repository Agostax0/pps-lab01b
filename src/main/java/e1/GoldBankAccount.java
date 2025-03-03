package e1;

public class GoldBankAccount implements BankAccount {
    public static final int MAXIMUM_OVERDRAFT = 500;
    private final BankAccount base;

    public GoldBankAccount(BankAccount bankAccount) {
        this.base = bankAccount;
    }

    @Override
    public int getBalance() {
        return this.base.getBalance();
    }

    @Override
    public void deposit(int amount) {
        this.base.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        if(getBalance() - amount < -MAXIMUM_OVERDRAFT) throw new IllegalStateException();

        this.base.withdraw(amount);
    }
}
