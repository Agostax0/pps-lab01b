package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoldBankAccountTest  extends BaseBankAccountTest {

    @BeforeEach
    void init(){
        this.account = new GoldBankAccount(new CoreBankAccount());
    }

    @Test
    public void NoTransactionFee(){
        this.account.deposit(INITIAL_DEPOSIT_AMOUNT);
        final int withdrawAmount = 500;
        this.account.withdraw(withdrawAmount);

        final int expectedBalance = INITIAL_BALANCE_AMOUNT + INITIAL_DEPOSIT_AMOUNT - withdrawAmount;
        assertEquals(expectedBalance, this.account.getBalance());
    }
}
