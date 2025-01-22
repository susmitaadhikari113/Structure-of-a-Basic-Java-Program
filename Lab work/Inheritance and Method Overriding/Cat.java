abstract class Animal {
    abstract void sound(); // Abstract method
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal myCat = new Cat(); // Create a Cat object
        myCat.sound(); // Call the sound method
    }
}