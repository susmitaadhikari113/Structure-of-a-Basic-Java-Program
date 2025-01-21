public class ConstructorOverloading {
    String name;
    int age;

    ConstructorOverloading(String name) {
        this.name = name;
    }

    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading("Bob");
        ConstructorOverloading obj2 = new ConstructorOverloading("Charlie", 30);
        obj1.display();
        obj2.display();
    }
}