import org.junit.Test;
import staff.Employee;
import staff.management.Director;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Test
    public void employeeAsDirector() {
        employee = new Director("Joe", "WE23 456 298", 340000, 150000, "Sales");
        assertEquals(employee.getName(), "Joe");
//        assertEquals(150000, employee.getBudget(), 0.001);
    }

    @Test
    public void employeeAsDeveloper() {
        employee = new Developer("Anne", "SO26 524 819", 30000);
        assertEquals(employee.getName(), "Anne");
    }

}
