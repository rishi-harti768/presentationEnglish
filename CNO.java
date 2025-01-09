// demo for class and objects
class Car1 {
    // the properties of the object can be represented by data members
    String brand;
    String color;
    int year;

    // the methods of the object can be represented by member functions
    public void displayDetails() {
        System.out.println("Car Details:\n");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class CNO {
    public static void main(String[] args) {
        Car1 car = new Car1();

        car.setBrand("Toyota");
        car.setColor("Red");
        car.setYear(2021);

        car.displayDetails();
    }
}