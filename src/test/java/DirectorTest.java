import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Zuhayr", 500_000.00, "PG 42 63 75 C", "Earth", 1_000_000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Zuhayr", director.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(500_000.00, director.getSalary(), 0.0001);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Earth", director.getDeptName());
    }

    @Test
    public void salaryRaises(){
        double incrementAmount = 100_000.00;
        director.raiseSalary(incrementAmount);
        assertEquals(600_000.00, director.getSalary(), 0.001);
    }

    @Test
    public void payBonus(){
        assertEquals(5000.00, director.payBonus(), 0.001);
    }

    @Test
    public void hasBudget(){
        assertEquals(1_000_000.00, director.getBudget(), 0.001);
    }

}

