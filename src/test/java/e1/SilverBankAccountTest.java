package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SilverBankAccountTest extends BaseBankAccountTest {

    @BeforeEach
    void init(){
        this.account = new SilverBankAccount(new CoreBankAccount());
    }

    @Test
    public void testCanWithdraw() {
        this.account.deposit(INITIAL_DEPOSIT_AMOUNT);
        this.account.withdraw(200);
        assertEquals(799, this.account.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        this.account.deposit(INITIAL_DEPOSIT_AMOUNT);
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(1200));
    }

}
