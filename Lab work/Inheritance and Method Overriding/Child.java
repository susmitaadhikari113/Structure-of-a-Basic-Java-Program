class Grandparent {
    void display() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends Grandparent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the child class.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}