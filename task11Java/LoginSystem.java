package task11Java;
import java.util.Scanner;

public class LoginSystem {
    private static final String CORRECT_PASSWORD = "correctpassword";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        try {
            login(enteredPassword);
            System.out.println("Login successful!");
            // Proceed with further actions after successful login
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password. Please try again.");
            // Optionally, you can handle retry logic here
        }
    }

    public static void login(String password) throws InvalidPasswordException {
        if (!password.equals(CORRECT_PASSWORD)) {
            throw new InvalidPasswordException();
        }
        // If password is correct, proceed with login logic
    }

    static class InvalidPasswordException extends Exception {
        // Custom exception class for invalid password
    }
}
