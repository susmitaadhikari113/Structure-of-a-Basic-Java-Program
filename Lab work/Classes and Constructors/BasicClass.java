public class BasicClass {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        BasicClass obj = new BasicClass();
        obj.name = "Alice";
        obj.age = 25;
        obj.display();
    }
}