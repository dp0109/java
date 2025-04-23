public class ConstructorOverloading {

    // Constructor with no parameters
    public ConstructorOverloading() {
        System.out.println("No parameters constructor called.");
    }

    // Constructor with one integer parameter
    public ConstructorOverloading(int a) {
        System.out.println("Constructor with one integer parameter called: " + a);
    }

    // Constructor with two parameters (an integer and a string)
    public ConstructorOverloading(int a, String b) {
        System.out.println("Constructor with an integer and a string parameter called: " + a + ", " + b);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorOverloading obj1 = new ConstructorOverloading();                   
        ConstructorOverloading obj2 = new ConstructorOverloading(10);               
        ConstructorOverloading obj3 = new ConstructorOverloading(20, "Hello");      
    }
}

