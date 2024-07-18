import java.util.Scanner;

class HollowDiamondPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows (half of the diamond): ");
        int rows = scanner.nextInt();
        
        // Print the hollow diamond pattern
        printHollowDiamondPyramid(rows);
        
        scanner.close();
    }
    
    // Method to print the hollow diamond pyramid pattern
    public static void printHollowDiamondPyramid(int rows) {
        int n = rows;
        
        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces for hollow effect
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars and spaces for hollow effect
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
