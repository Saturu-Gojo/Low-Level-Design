public class SalaryCalculate {
    public double calculateNetSalary(Employee employee) {
        double bonus = 100000;
        double taxPercentage = 20;
        double grossSalary = employee.getSalary() + bonus;
        return grossSalary - (grossSalary * (taxPercentage / 100));
    }
}
