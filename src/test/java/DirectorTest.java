import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Janet", "JE35 821 293", 70000.00, 300000000, "Sales");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(300.00);
        assertEquals(70300.00, director.getSalary(), 1);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(1400, director.payBonus(), 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Janet", director.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(70000.00, director.getSalary(),1);
    }

    @Test
    public void canGetNin() {
        assertEquals("JE35 821 293", director.getNin());
    }

    @Test
    public void canGetBudget() {
        assertEquals(300000000, director.getBudget(), 1);
    }

    @Test
    public void canChangeName() {
        director.updateName("Johnny");
        assertEquals("Johnny", director.getName());
    }

}
