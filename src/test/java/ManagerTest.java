import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Loki", 100_000.00, "PG 32 53 85 C", "Earth");
    }

    @Test
    public void hasName(){
        assertEquals("Loki", manager.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(100_000.00, manager.getSalary(), 0.0001);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Earth", manager.getDeptName());
    }

    @Test
    public void salaryRaises(){
        double incrementAmount = 50_000.00;
        manager.raiseSalary(incrementAmount);
        assertEquals(150_000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void payBonus(){
        assertEquals(1000.00, manager.payBonus(), 0.001);
    }

}
