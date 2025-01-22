public class MethodParameters {
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        MethodParameters obj = new MethodParameters();
        obj.greet("Eve");
    }
}