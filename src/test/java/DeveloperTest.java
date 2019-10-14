import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Sue", "JE23 254 765", 35000.00);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(200.00);
        assertEquals(35200.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(350, developer.payBonus(), 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Sue", developer.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(35000.00, developer.getSalary(),0.001);
    }

    @Test
    public void canGetNin() {
        assertEquals("JE23 254 765", developer.getNin());
    }

    @Test
    public void canChangeName() {
        developer.updateName("Johnny");
        assertEquals("Johnny", developer.getName());
    }

}
