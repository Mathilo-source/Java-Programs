// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void sound() {//overriding
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void sound() {//overriding
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Animal a;   // Superclass reference

        a = new Dog();
        a.sound();  // Calls Dog's version

        a = new Cat();
        a.sound();  // Calls Cat's version
    }
}
//dynamic method dispatch is basically runtime polymorphism
//it is where the method that gets executed is decided at runtime not at compile time
