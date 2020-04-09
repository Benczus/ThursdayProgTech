package hu.uni.eszterhazy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class EmployeeTest {
    Employee ceo;
    @Before
    public void setUp() throws Exception {
        ceo = new EmployeeImpl("Jozsef", new EmployeeImpl("Béla", new Accountant("Sándor")), new Accountant("Krisztina"));

    }

    @Test
    public void EmployeeComposite2EmployeesPrintTest() {


        Assert.assertEquals("I am Jozsef, an employee, my employees are : I am Bela, an employee, I am Krisztina, an accountant", ceo.operation());
    }
}
