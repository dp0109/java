class VariableDemo {
    // Instance variable
    private int instanceVariable;

    // Constructor to initialize the instance variable
    public VariableDemo(int value) {
        this.instanceVariable = value;
    }

    // Method to demonstrate local variable
    public void displayVariables() {
        // Local variable
        int localVariable = 10;

        // Displaying instance and local variables
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
        // Creating an instance of VariableDemo
        VariableDemo demo = new VariableDemo(5);

        // Calling the method to display variables
        demo.displayVariables();
    }
}