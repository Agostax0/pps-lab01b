package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BronzeBankAccountTest extends BaseBankAccountTest{
    @BeforeEach
    void init(){
        this.account = new BronzeBankAccount(new CoreBankAccount());
    }

    @Test
    public void DontApplyFeeIfUnderThreshold(){
        this.account.deposit(INITIAL_DEPOSIT_AMOUNT);

        this.account.withdraw(100);

        final int expectedBalance = INITIAL_BALANCE_AMOUNT + INITIAL_DEPOSIT_AMOUNT - 100;
        assertEquals(expectedBalance, this.account.getBalance());
    }
}
