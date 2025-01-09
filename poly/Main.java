package poly;

public class Main {
    public static void main(String[] args) {
        // Demonstrate Runtime Polymorphism (Method Overriding)
        Animal myAnimal; // Parent class reference

        myAnimal = new Dog(); // Dog object
        myAnimal.makeSound(); // Calls Dog's makeSound method

        myAnimal = new Cat(); // Cat object
        myAnimal.makeSound(); // Calls Cat's makeSound method

        // Demonstrate Compile-Time Polymorphism (Method Overloading)
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 integers: " + calculator.add(10, 20)); // Calls add(int, int)
        System.out.println("Sum of 3 integers: " + calculator.add(10, 20, 30)); // Calls add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calculator.add(10.5, 20.5)); // Calls add(double, double)
    }
}
