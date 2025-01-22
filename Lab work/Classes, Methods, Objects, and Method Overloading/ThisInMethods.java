public class ThisInMethods {
    int x;

    ThisInMethods(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Value of x: " + this.x);
    }

    public static void main(String[] args) {
        ThisInMethods obj = new ThisInMethods(15);
        obj.display();
    }
}