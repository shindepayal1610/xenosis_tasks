import java.util.Scanner;

class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Attempt to divide 10 by the user-provided number
            int result = 10 / number;
            
            // Display the result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Error: An unexpected error occurred: " + e.getMessage());
        } finally {
            // Cleanup operations
            scanner.close();
            System.out.println("Cleanup: Scanner resource closed.");
        }
    }
}
