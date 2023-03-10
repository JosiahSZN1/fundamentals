import java.util.ArrayList;
import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
// Why Java?

    // Dynamic and Static
        // int ourInt;    // 1
        // String ourString = "hello world";    // 2
        // ourInt = "Hello world";    // 3 ERROR!
// Conditionals & Operators 

    // If Statements
        // if (condition) {
        //     // what to do if condition is true
        // }
        // // continue with program
        // boolean isRaining = true;
            
        // if(isRaining) {
        //     System.out.println("Bring an umbrella.");
        // }

        // If-Else Chains
        // if(condition) {
        //     // what to do if condition is true
        // }
        // else if(2nd condition) {        
        //     // what to do if 2nd condition is true
        // }
        // // ... can have 0 to many else-if statements ...
        // else {                           
        //     // what to do if none of the previous conditions are met
        // } // can have 1 or no else statement

        // If / Else Statements
        // boolean isRaining = true;
        
        // if(isRaining) {
        //     System.out.println("Bring an umbrella.");
        // }
        // else {
        //     System.out.println("Have fun!");
        // }

        // If /Else If / Else Statements
        // boolean isRaining = true;
        boolean isCold = true;
            
        // if(isRaining) {
        //     System.out.println("Bring an umbrella.");
        // }
        // else if(isCold) {
        //     System.out.println("Wear a coat.");
        // }
        // else {
        //     System.out.println("Have fun!");
        // }

    // Assignment Operator vs Comparison Operators
        // int count = 1; // assigns a value

        // Comparison Operators
        // int count = 1; // assigns a value
        // count == 1; // evaluates to true
        // count == 2; // evaluates to false

        // count != 2; // true
        // count != 1; // false

        // count > 2; // false
        // count > 0; // true

        // count < 2; // true
        // count < 1; // false

        // count >= 2; // false;
        // count >= 1; // true

        // count <= 2; // true;
        // count <= 1; // true
    
    // Logical Operators
        // int age = 45;
    
        // age < 65 && age > 17; 
        // evaluates to true
        //(Would pay adult price)
            
        // age < 110 && age > 65; 
        // false
        // (Is not a senior, nor immortal)

        // int age = 77;
        // age < 10 || age > 65;
        // true
        // (Doesn't care what people think!)

        int age = 16;
        // !(age < 16)
        // true
        // (May obtain a drivers license)

// Switch Statements and Ternary Operators
        int day = 7;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There are only seven days in a week...");
        }
    
    // Ternary Operators
        boolean isRaining = true;
            
        if(isRaining) {
            System.out.println("Bring an umbrella.");
        }
        else {
            System.out.println("Have fun!");
        }

        System.out.println(isRaining ? "Bring an umbrella" : "Have fun!");

// ArrayLists (Dynamic Arrays)

        ArrayList<Integer> myArray = new ArrayList<Integer>();

        // Add items to the array (expanding the size)
        myArray.add(10); // { 10 }
        myArray.add(11); // { 10, 11 }
        // To read values from the array,
        // use .get() passing in the index
        Integer num = myArray.get(0); // 10
            
        // Overwrite values in the array
        // use .set() passing in the index 
        // and the value you want to change it to
        myArray.set(0, 9); // { 9, 11 }

// Loops
        // System.out.println(myArray[0]);
        // System.out.println(myArray[1]);
        // System.out.println(myArray[2]);
        // System.out.println(myArray[3]);
        // System.out.println(myArray[4]);
        // System.out.println(myArray[5]);
        // // ...
        // System.out.println(myArray[99]);

    // While loop
        // int i = 0;
        // while(i < 7)
        // {
        //     System.out.println("foo");
        //     i++;
        // }
    
    // For Loop
        for (int i = 0; i < 7; i++){
            System.out.println("bar");
        }
        // for (initialization; termination; increment){
        //     body statements
        // }
        // int i = integer from-rainbow">0;
        // while(i ="operator from-rainbow">< 7)
        // {
        //     System.out.println("bar");
        //     i++;
        // }
        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        for (int i = 0; i < dynamicArray.size(); i++){
            System.out.println(dynamicArray.get(i));
        }

    // Enhanced For Loop
        for(int i = 0; i < dynamicArray.size(); i++){
            String name = dynamicArray.get(i);
            System.out.println("hello " + name);
            // other operations using name
        }

        for(String name : dynamicArray){
            System.out.println("hello " + name);
            // other operations using name
        }

        // for(element container : collection){
        //     // body statements
        // }

    // When to not use the Enhanced For Loop
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Pretzels");
        snacks.add("Almonds");
        snacks.add("Yogurt");
        // for(String snack : snacks ) {
        //     if(snack.charAt(0) == 'A') {
        //         snacks.remove(snack);
        //     }
        // }
        // this will encounter an error like
        // Exception in thread "main" java.util.ConcurrentModificationException

        for(int i=0; i<snacks.size(); i++) {
            if(snacks.get(i).charAt(0) == 'A') {
                snacks.remove(i);
            }
        }
        System.out.println(snacks);

        HashMap<String, String> userMap = new HashMap<String, String>();

        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");

        String name = userMap.get("nninja@codingdojo.com");
    }
}