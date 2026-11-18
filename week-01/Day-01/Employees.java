public class Employees {
    private int employeeId;
    private String name;
    private String department;
    private double salary;

    // Parameterized constructor
    public Employees(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setters to modify state
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Calculate annual salary based on monthly salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Monthly Salary: ₹" + String.format("%,.2f", salary));
        System.out.println("Annual Salary : ₹" + String.format("%,.2f", calculateAnnualSalary()));
        System.out.println("----------------------------------------");
    }
}
