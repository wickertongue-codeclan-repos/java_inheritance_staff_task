import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Tom", "HU34 623 978", 24000.00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(200.00);
        assertEquals(24200.00, databaseAdmin.getSalary(), 1);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(240, databaseAdmin.payBonus(), 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Tom", databaseAdmin.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(24000.00, databaseAdmin.getSalary(),1);
    }

    @Test
    public void canGetNin() {
        assertEquals("HU34 623 978", databaseAdmin.getNin());
    }

}
