package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;
    public Manager(String name, Double salary, String nationalInsuranceNumber, String deptName) {
        super(name, salary, nationalInsuranceNumber);
        this.deptName = deptName;
    }


    public String getDeptName() {
        return deptName;
    }
}
