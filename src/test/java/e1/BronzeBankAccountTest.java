package e1;

import org.junit.jupiter.api.BeforeEach;

public class BronzeBankAccountTest extends BaseBankAccountTest{
    @BeforeEach
    void init(){
        this.account = new BronzeBankAccount(new CoreBankAccount());
    }
}
