public class StaticInstanceExample {
    static int staticVar = 0; // Static variable
    int instanceVar; // Instance variable

    StaticInstanceExample() {
        instanceVar++;
        staticVar++;
    }

    void display() {
        System.out.println("Static Variable: " + staticVar + ", Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {
        StaticInstanceExample obj1 = new StaticInstanceExample();
        StaticInstanceExample obj2 = new StaticInstanceExample();
        obj1.display();
        obj2.display();
    }
}
