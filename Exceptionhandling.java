public class Exceptionhandling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // This will cause ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
