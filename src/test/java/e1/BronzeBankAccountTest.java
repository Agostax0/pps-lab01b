package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BronzeBankAccountTest extends BaseBankAccountTest{

    public static final int WITHDRAWAL_FEE_THRESHOLD = 100;

    @BeforeEach
    void init(){
        this.account = new BronzeBankAccount(new CoreBankAccount());
    }

    @Test
    public void dontApplyFeeIfUnderThreshold(){
        this.account.deposit(INITIAL_DEPOSIT_AMOUNT);

        this.account.withdraw(WITHDRAWAL_FEE_THRESHOLD);

        final int expectedBalance = INITIAL_BALANCE_AMOUNT + INITIAL_DEPOSIT_AMOUNT - WITHDRAWAL_FEE_THRESHOLD;
        assertEquals(expectedBalance, this.account.getBalance());
    }
}
