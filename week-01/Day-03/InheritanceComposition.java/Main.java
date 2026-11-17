// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Employee {
    private String employeeId;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String var1, String var2, double var3) {
        this.employeeId = var1;
        this.name = var2;
        this.salary = var3;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void displayRole() {
        System.out.println("Role: " + this.getClass().getSimpleName());
    }
}

class Manager extends Employee {
    private String department;
    private int teamSize;

    // Full constructor passing base employee details to superclass
    public Manager(String employeeId, String name, double salary, String department, int teamSize) {
        super(employeeId, name, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    // Overloaded constructor if only manager-specific attributes are supplied
    public Manager(String department, int teamSize) {
        super("EMP-TEMP", "Unnamed Manager", 0.0);
        this.department = department;
        this.teamSize = teamSize;
    }

    public String getDepartment() {
        return department;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: HR");
    }
}

class Developer extends Employee {
    private String lang;
    private String proj;

    // Full constructor passing base employee details to superclass
    public Developer(String employeeId, String name, double salary, String lang, String proj) {
        super(employeeId, name, salary);
        this.lang = lang;
        this.proj = proj;
    }

    // Overloaded constructor if only manager-specific attributes are supplied
    public Developer(String lang, String proj) {

        this.lang = lang;
        this.proj = proj;
    }

    public String getDepartment() {
        return lang;
    }

    public String getTeamSize() {
        return proj;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Developer");
    }
}

public class Main {
    public static void main(String[] args) {
        Developer e1 = new Developer("parth", "AI/ML");
        Manager m1 = new Manager("Marketing", 20);
        Employee d1 = new Employee("ABC101", "abc", 50000);

        e1.displayRole();
        m1.displayRole();
        d1.displayRole();

    }
}
