public class MethodOverloading {

   
    public int add(int a, int b) {
        return a + b;
    }

   
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

       
        System.out.println("Sum of 2 integers: " + obj.add(5, 10));           
        System.out.println("Sum of 3 integers: " + obj.add(5, 10, 15));     
        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 10.5));         
    }
}
