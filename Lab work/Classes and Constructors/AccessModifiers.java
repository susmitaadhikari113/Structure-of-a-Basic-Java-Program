public class AccessModifiers {
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable"; // package-private
     void display() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.display();
    }
}