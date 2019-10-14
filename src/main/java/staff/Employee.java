package staff;

public abstract class Employee {
    private String name;
    private String nin;
    private double salary;

    public Employee(String name, String nin, double salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNin() {
        return this.nin;
    }

    public double getSalary() {
        return this.salary;
    }

    public void updateName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String raiseSalary(double increaseBy) {
        String message = null;
        if (increaseBy < 0) {
            message = "Invalid input, please input a positive number.";
        } else {
            this.salary += increaseBy;
            message = "Salary has been increased by" + increaseBy + ". New salary equals " + getSalary();
        }
        return message;
    }

    public double payBonus() {
        return this.salary / 100;
    }


}
