import TechStaff.DatabaseAdmin;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Randolph", 30_000.00, "RT 72 32 16 G");
    }

    @Test
    public void hasName(){
        assertEquals("Randolph", databaseAdmin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(30_000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void salaryRaises(){
        double incrementAmount = 5_000.00;
        databaseAdmin.raiseSalary(incrementAmount);
        assertEquals(35_000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void payBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.001);
    }
}
