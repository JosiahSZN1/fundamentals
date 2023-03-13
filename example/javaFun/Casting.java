// Type Casting
public class Casting {
    public static void main(String[] args) {
        byte b =127;
        // int i = b;

        // System.out.println(i);

    // Explicit Casting
        double d = 35.25;
        double dd = 35.99;
        
        // casting the double d into a int
        // int i = (int) d;
        
        // casting the double dd into a int
        int ii = (int) dd;
        // System.out.println(i);
        System.out.println(ii);
    
    // Implicit Casting
        int i = 35;
        float f = i;
        System.out.println("The number is: " + f);
    }
}