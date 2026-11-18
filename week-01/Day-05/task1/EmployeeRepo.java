public class EmployeeRepo {
    public void saveToDatabase(Employee employee) {
        System.out.println("Saving employee " + employee.getName() + "  (ID: " + employee.getId() + " to database)");
    }
}
