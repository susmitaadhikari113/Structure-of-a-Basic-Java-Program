public class typecasting {
    public static void main(String[] args) {
        int intVar = 10;
        double doubleVar = intVar; // Implicit casting
        System.out.println("Double value: " + doubleVar);
        
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // Explicit casting
        System.out.println("Integer value: " + anotherInt);
    }
}
