package e1;

public class BronzeBankAccount implements BankAccount {
    public static final int WITHDRAW_FEE = 1;
    public static final int WITHDRAW_FEE_THRESHOLD = 100;
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
        if(amount > getBalance()) throw new IllegalStateException();

        if(amount < WITHDRAW_FEE_THRESHOLD) base.withdraw(amount);
        else base.withdraw(amount + WITHDRAW_FEE);

    }
}
