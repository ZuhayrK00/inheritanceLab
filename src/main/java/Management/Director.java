package Management;

import Staff.Employee;

public class Director extends Manager {

    private Double budget;

    public Director(String name, Double salary, String nationalInsuranceNumber, String deptName, double budget) {
        super(name, salary, nationalInsuranceNumber, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

}
