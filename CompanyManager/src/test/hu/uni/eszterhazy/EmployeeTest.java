package hu.uni.eszterhazy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    Employee ceo;
    @Before
    public void setUp() throws Exception {
        ceo = new EmployeeImpl("Jozsef");
        Employee bela= new EmployeeImpl("Bela");
        bela.add(new Accountant("Sándor"));
        ceo.add(bela);
        ceo.add(new Accountant("Krisztina"));
    }

    @Test
    public void EmployeeComposite2EmployeesPrintTest() {


        Assert.assertEquals("I am Jozsef, an employee, my employees are : I am Bela, an employee, I am Krisztina, an accountant", ceo.operation());
    }
}
