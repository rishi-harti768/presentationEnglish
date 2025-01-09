// Parent Class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Child Class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

public class Late {
    public static void main(String[] args) {
        // Reference of type Animal pointing to a Dog object
        Animal animal1 = new Dog();
        animal1.sound(); // Late binding: Dog's sound method is invoked

        // Reference of type Animal pointing to a Cat object
        Animal animal2 = new Cat();
        animal2.sound(); // Late binding: Cat's sound method is invoked

        // Reference of type Animal pointing to an Animal object
        Animal animal3 = new Animal();
        animal3.sound(); // Late binding: Animal's sound method is invoked
    }
}
