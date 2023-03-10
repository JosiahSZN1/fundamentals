// Type Casting
    // Primitive vs Object types
            // Performance: Object types are an instance of a class. They usually hold data and methods. Therefore, their memory capacity is much bigger than their primitive counterpart. Let's look at an example:
public class TestSum {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // Integer sum = 0;
        int sum =0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds");
    }
}