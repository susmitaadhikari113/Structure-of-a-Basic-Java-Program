// File: MyPackage/SubPackage/MySubClass.java
package MyPackage.SubPackage;

public class MySubClass {
    public void display() {
        System.out.println("Hello from MySubClass in SubPackage!");
    }
}

// File: Main.java
import MyPackage.SubPackage.MySubClass;

public class Main {
    public static void main(String[] args) {
        MySubClass obj = new MySubClass();
        obj.display();
    }
}