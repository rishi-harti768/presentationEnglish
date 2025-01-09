// Parent Class (Superclass)
class Vehicle {
    String brand;

    // Constructor for the parent class
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Method in the parent class
    public void start() {
        System.out.println(brand + " is starting...");
    }

    public void stop() {
        System.out.println(brand + " is stopping...");
    }
}

// Child Class (Subclass)
class Car extends Vehicle {
    int numberOfDoors;

    // Constructor for the child class
    public Car(String brand, int numberOfDoors) {
        super(brand); // Call the parent class constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Method in the child class
    public void honk() {
        System.out.println(brand + " is honking: Beep! Beep!");
    }
}

// Another Child Class
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    // Constructor for the child class
    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand); // Call the parent class constructor
        this.hasSidecar = hasSidecar;
    }

    // Method in the child class
    public void revEngine() {
        System.out.println(brand + " is revving the engine: Vroom! Vroom!");
    }
}

// Main class to test inheritance
public class Inherit {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car car = new Car("Toyota", 4);
        car.start();
        car.honk();
        car.stop();

        System.out.println();

        // Create an object of the Motorcycle class
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", false);
        motorcycle.start();
        motorcycle.revEngine();
        motorcycle.stop();
    }
}
