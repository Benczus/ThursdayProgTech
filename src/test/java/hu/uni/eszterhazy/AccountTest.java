package hu.uni.eszterhazy;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {


    Account account= new Account(1234, "Kis József");

    @Before
    public void initClasses(){
        account.subscribeObserver(new EmailMesseger());
        account.subscribeObserver(new PhoneMesseger());
        account.subscribeObserver(new PhoneMesseger());
    }

    @Test
    public void checkObserverBehaviour() {
        account.notifyObservers("Hello World!");
    }
}
