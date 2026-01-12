import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        // Declare and instantiate the 2D array
        int[][] marks = new int[20][8];

        Scanner input = new Scanner(System.in);

        // Input marks
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            for (int j = 0; j < 8; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                marks[i][j] = input.nextInt();
            }
        }

        // Display the marks
        System.out.println("\nMarks Entered:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < 8; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
