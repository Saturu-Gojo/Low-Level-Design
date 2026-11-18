public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println(" DAY 1: OBJECT-ORIENTED PROGRAMMING DELIVERABLES ");
        System.out.println("=================================================\n");

        // -----------------------------------------------------------------
        // TASK 1 & 2: EMPLOYEE CLASS & INDEPENDENT OBJECTS DEMONSTRATION
        // -----------------------------------------------------------------
        System.out.println(">>> [TASK 1 & 2] CREATING INDEPENDENT EMPLOYEE OBJECTS <<<\n");

        Employees emp1 = new Employees(101, "Rahul", "Engineering", 50000.0);
        Employees emp2 = new Employees(102, "Priya", "HR", 40000.0);
        Employees emp3 = new Employees(103, "Aman", "Finance", 60000.0);

        System.out.println("Initial Details of All 3 Employees:");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        System.out.println("\n>>> PROOF OF STATE INDEPENDENCE <<<");
        System.out.println("Modifying Employee 101 (Rahul):");
        System.out.println("- Changing Department to 'Product'");
        System.out.println("- Changing Monthly Salary to ₹75,000.00\n");

        emp1.setDepartment("Product");
        emp1.setSalary(75000.0);

        System.out.println("State of Employee 101 after modification:");
        emp1.displayDetails();

        System.out.println("\nChecking Employee 102 (Priya) and Employee 103 (Aman) to verify state didn't change:");
        emp2.displayDetails();
        emp3.displayDetails();

        System.out.println("Memory Identity Verification (Heap References):");
        System.out.println("emp1 memory identity hash: " + System.identityHashCode(emp1));
        System.out.println("emp2 memory identity hash: " + System.identityHashCode(emp2));
        System.out.println("emp3 memory identity hash: " + System.identityHashCode(emp3));
        System.out.println("Result: Each reference points to an isolated block in Heap memory.\n");
    }
}
