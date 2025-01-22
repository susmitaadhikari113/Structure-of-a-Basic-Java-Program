// File: MyPackage/MyClass.java
package MyPackage;

public class MyClass {
  public void display() {
      System.out.println("Hello from MyClass in MyPackage!");
  }
}

// File: Main.java
import MyPackage.MyClass;

public class Main {
  public static void main(String[] args) {
      MyClass obj = new MyClass();
      obj.display();
  }
}