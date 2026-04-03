public class FullTimeEmployee extends Employee {
    private double annualSalary;
    public FullTimeEmployee(String name, String id, double annualSalary) {
        super(name,id);
        this.annualSalary=annualSalary;
    }
    public double calculateMonthlySalary() throws InvalidSalaryException {
        if (annualSalary<= 0) throw new InvalidSalaryException("Annual salary neet to positive");
        return annualSalary /12;
    }
}
