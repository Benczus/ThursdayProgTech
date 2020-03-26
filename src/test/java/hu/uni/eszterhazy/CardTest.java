package hu.uni.eszterhazy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CardTest {

    Card card;
    String ownerName;
    int cvc;
    @Before
    public void initClasses() {
        ownerName= "Nagy Pista";
        cvc=123;
        card = new Card.CardBuilder(ownerName).setCvc(cvc).build();
    }

    @Test
    public void checkCreditAvailability(){

    }

    @Test
    public void checkDepositAmount(){

    }

    @Test
    public void checkWithdrawAmount(){

    }

    @Test
    public void checkCurrentBalanceAmount(){

    }

    @Test
    public void checkWithdrawalMaxRestriction(){

    }

    @Test
    public void checkWithdrawalMinRestriction(){

    }



    @Test
    public void isCardDeclined(){

    }

    @Test
    public void isCardBuilderValid(){
        Assert.assertEquals(card.getOwnerName(), ownerName);
        Assert.assertEquals(card.getCvc(), cvc);
    }
}
