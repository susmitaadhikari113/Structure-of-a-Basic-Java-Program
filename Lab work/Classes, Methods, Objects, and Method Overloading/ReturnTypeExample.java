public class ReturnTypeExample {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ReturnTypeExample obj = new ReturnTypeExample();
        int sum = obj.add(10, 20);
        System.out.println("Sum: " + sum);
    }
}