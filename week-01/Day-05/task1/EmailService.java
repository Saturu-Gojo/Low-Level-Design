public class EmailService {
    public void sendEmail(Employee employee, String message) {
        System.out.println("Sending email to " + employee.getEmail() + ": " + message);
    }
}
