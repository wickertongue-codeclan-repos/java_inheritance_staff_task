import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bert", "HG23 256 234", 45000.00, "Sales");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(300.00);
        assertEquals(45300.00, manager.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(450, manager.payBonus(), 0.001);
    }

    @Test
    public void canGetName() {
        assertEquals("Bert", manager.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(45000.00, manager.getSalary(),0.001);
    }

    @Test
    public void canGetNin() {
        assertEquals("HG23 256 234", manager.getNin());
    }

}
