// File: MyPackage/PackageMember.java
package MyPackage;

public class PackageMember {
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";

    public void display() {
        System.out.println(publicVar);
        System.out.println(privateVar);
    }
}

// File: Main.java
import MyPackage.PackageMember;

public class Main {
    public static void main(String[] args) {
        PackageMember obj = new PackageMember();
        obj.display();
        // System.out.println(obj.privateVar); // This line would cause an error
    }
}