public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}