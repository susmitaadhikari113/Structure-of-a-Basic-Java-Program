public class ObjectCreation {
    String name;

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ObjectCreation obj = new ObjectCreation();
        obj.name = "David";
        obj.display();
    }
}