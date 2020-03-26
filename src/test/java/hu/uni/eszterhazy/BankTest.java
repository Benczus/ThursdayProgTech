package hu.uni.eszterhazy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class BankTest
{

    Bank bank;
    Bank bankSingletonTester;

    @Before
    public void initClasses(){

    bank= Bank.getBank();
    bankSingletonTester = Bank.getBank();


    }


    @Test
    public void checkExchangeCurrenciesEURtoHUF(){

    }


    @Test
    public void checkExchangeCurrenciesHUFtoEUR(){

    }

    @Test
    public void isBankCodeAvailable(){

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void generateNewBankCode() {
    }

    @Test
    public void addNewUserAccount() {
    }



    @Test
    public void singletonBehaviour(){
        Assert.assertEquals(bank, bankSingletonTester);
    }
}
