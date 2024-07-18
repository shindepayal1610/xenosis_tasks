import java.util.Scanner;

class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Print the number-increasing reverse pyramid pattern
        printNumberIncreasingReversePyramid(rows);
        
        scanner.close();
    }
    
    // Method to print the number-increasing reverse pyramid pattern
    public static void printNumberIncreasingReversePyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
