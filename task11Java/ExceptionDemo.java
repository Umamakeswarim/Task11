package task11Java;
public class ExceptionDemo {
    public static void main(String[] args) {
        // Demonstrating ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // Trying to access an index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        // Demonstrating StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            System.out.println(str.charAt(10)); // Trying to access a character at an index out of bounds
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}

