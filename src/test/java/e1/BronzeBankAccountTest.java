package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BronzeBankAccountTest extends BaseBankAccountTest{

    public static final int WITHDRAWAL_FEE_THRESHOLD = 100;
    public static final int WITHDRAW_FEE = 1;

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

    @Test
    public void applyFeeIfOverThreshold(){
        this.account.deposit(INITIAL_DEPOSIT_AMOUNT);

        final int moreThanWithdrawalFeeThreshold = WITHDRAWAL_FEE_THRESHOLD + 1;

        this.account.withdraw(moreThanWithdrawalFeeThreshold);

        final int expectedBalance = INITIAL_BALANCE_AMOUNT + INITIAL_DEPOSIT_AMOUNT - moreThanWithdrawalFeeThreshold - WITHDRAW_FEE;

        assertEquals(expectedBalance, this.account.getBalance());
    }
}
