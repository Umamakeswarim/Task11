package task11Java;
// Main class demonstrating exception handling

public class AgeValidation {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            // Example: User enters an age
            int userAge = 16;
            validateAge(userAge);
        } catch (InvalidAgeException e) {
            // Exception caught: display error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}