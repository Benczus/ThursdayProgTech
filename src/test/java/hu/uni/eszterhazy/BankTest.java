package hu.uni.eszterhazy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class BankTest
{
    /**
     * Rigorous Test :-)
     */

    @Before
    public void initClasses(){

    Bank bank= new Bank(UUID.randomUUID(), "Bogdandy Banking Inc.", "Eger", "Bence Bogdandy", Bank.generateNewBankCode() );
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
}
