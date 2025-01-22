public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}