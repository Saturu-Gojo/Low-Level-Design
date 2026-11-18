public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("1", 1000, "Parth", "abc@gmail.com");
        EmployeeRepo employeeRepo = new EmployeeRepo();
        EmployeeReport employeeReport = new EmployeeReport();
        EmailService emailService = new EmailService();
        SalaryCalculate salaryCalculate = new SalaryCalculate();
        employeeRepo.saveToDatabase(employee);
        employeeReport.generateReport(employee, salaryCalculate.calculateNetSalary(employee));
        emailService.sendEmail(employee, "Welcome");
        System.out.println("Employee data saved successfully");

    }
}
