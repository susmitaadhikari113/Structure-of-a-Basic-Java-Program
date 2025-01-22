class Base {
    void display() {
        System.out.println("Base class method");
    }
}

class Derived extends Base {
    void display() {
        super.display(); // Call the base class method
        System.out.println("Derived class method");
    }

    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display();
    }
}