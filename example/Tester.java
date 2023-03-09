// Example code demo from lecture 3/7/2023
// public class Tester {
//     public static void main(String[] args) {
//         String message = "Hello world";
//         System.out.println(message);
//     }
// }

// Example code demo from lecture 3/8/2023
public class Tester {
    // Method signature: main String[]
    public static void main(String[] args) {
        System.out.println(greeting());
        System.out.println(greeting("Jonathan"));
    }

    // Method signature: greeting
    public static String greeting() {
        return "Hello!";
    }

    // Method signature: greeting String
    public static String greeting(String name) {
        return "Hello, " + name;
    }
}