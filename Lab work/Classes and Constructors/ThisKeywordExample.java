public class ThisKeywordExample {
    int x;

    ThisKeywordExample(int x) {
        this.x = x; // 'this' refers to the current object's variable
    }

    void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        ThisKeywordExample obj = new ThisKeywordExample(10);
        obj.display();
    }
}