package hu.uni.eszterhazy;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.UUID;

public class AccountTest {


    Account account= new Account(1234, "Kis József");

    @Before
    public void initClasses(){
        account.subscribeObserver(new EmailMesseger(account));
        account.subscribeObserver(new PhoneMesseger(account));
        account.subscribeObserver(new PhoneMesseger(account));
        account.addNewCard(
                new Card.CardBuilder("Kis József")
                        .setCvc(213)
                        .setCardNum("12416534234")
                        .setExpDate(LocalDate.of(2065, 11, 10))
                        .build()
        );
    }

    @Test
    public void checkObserverBehaviour() {
        account.withdraw(12.2);
    }

    @Test
    public void testPaymentStrategyBehaviour() {
        account.pay(12.2, new PaypalPaymentStrategy("KisJóska@fakemail.com", "kisjoskavagyok"));
        account.pay(250.0, new InternetPaymentStrategy(account.getCards().get(0)));
        account.pay(123.1, new DirectPaymentStrategy(5231, UUID.randomUUID()));
    }
}
