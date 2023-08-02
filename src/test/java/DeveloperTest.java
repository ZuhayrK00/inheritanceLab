import Management.Manager;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mark", 40_000.00, "JR 82 23 65 C");
    }

    @Test
    public void hasName(){
        assertEquals("Mark", developer.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(40_000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void salaryRaises(){
        double incrementAmount = 10_000.00;
        developer.raiseSalary(incrementAmount);
        assertEquals(50_000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void payBonus(){
        assertEquals(400, developer.payBonus(), 0.001);
    }
}
