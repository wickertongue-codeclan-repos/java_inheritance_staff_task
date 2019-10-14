package staff.management;

public class Director extends Manager {
    private double budget;

    public Director(String name, String nin, double salary, double budget, String deptName) {
        super(name, nin, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus() {
        return super.payBonus() * 2;
    }

}
