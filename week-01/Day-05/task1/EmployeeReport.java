public class EmployeeReport {
    public void generateReport(Employee e, double NetSalary) {
        System.out.println("----- Employee Report -----");
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Base Salary: $" + NetSalary);
        System.out.println("Email: " + e.getEmail());
        System.out.println("---------------------------");
    }
}
