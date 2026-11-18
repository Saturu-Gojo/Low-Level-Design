public class Employee {
    private String id;
    private double salary;
    private String Name;
    private String email;

    public Employee(String id, double salary, String name, String email) {
        this.salary = salary;
        this.Name = name;
        this.id = id;
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

}
