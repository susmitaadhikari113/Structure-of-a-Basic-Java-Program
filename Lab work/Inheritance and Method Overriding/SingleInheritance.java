class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.show();
    }
}