package Staff;

public abstract class Employee {
    private String name;
    private Double salary;
    private String nationalInsuranceNumber;

    public Employee(String name, Double salary, String nationalInsuranceNumber) {
        this.name = name;
        this.salary = salary;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void raiseSalary(double amount) {
        salary += amount;
    }

    public double payBonus (){
        return salary * 0.01;
    }
}
