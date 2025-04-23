class Car {
    // Attributes
    String model;
    int year;

    // Default constructor
    public Car() {
        this.model = "Unknown Model";
        this.year = 0;
    }

    // Parameterized constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class Consttype {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Car car1 = new Car();
        System.out.println("Details of Car 1 (using default constructor):");
        car1.displayDetails();

        // Creating an object using the parameterized constructor
        Car car2 = new Car("Toyota Camry", 2021);
        System.out.println("\nDetails of Car 2 (using parameterized constructor):");
        car2.displayDetails();
    }
}
