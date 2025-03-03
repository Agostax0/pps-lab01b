package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GoldBankAccountTest  extends BaseBankAccountTest {

    @BeforeEach
    void init(){
        this.account = new GoldBankAccount(new CoreBankAccount());
    }

}
