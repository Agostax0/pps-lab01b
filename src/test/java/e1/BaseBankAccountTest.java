package e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseBankAccountTest {
    protected static final int INITIAL_DEPOSIT_AMOUNT = 1000;
    protected static final int INITIAL_BALANCE_AMOUNT = 0;

    protected BankAccount account;

    @Test
    public void testInitiallyEmpty() {
        assertEquals(INITIAL_BALANCE_AMOUNT, this.account.getBalance());
    }

    @Test
    public void testCanDeposit() {
        this.account.deposit(INITIAL_DEPOSIT_AMOUNT);
        assertEquals(INITIAL_DEPOSIT_AMOUNT, this.account.getBalance());
    }
}
