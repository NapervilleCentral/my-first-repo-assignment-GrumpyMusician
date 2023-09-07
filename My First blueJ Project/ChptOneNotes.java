
/**
 * Andy Liang
 * 8/24/23
 * ChptOneNotes
 * This is my Chapter One Notes
 */

// Put your import statements here!
import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;

public class ChptOneNotes // Name of class must match the file name!
{
   public static void main(String[] args) 
   {    
           
       
         // These are basic data types
         int integer = 5; // An integer of any number
         double doubnum = 5.6; // A floating number (All real Numbers)
         boolean truefalse = false; // Set to true or false
         char character = 'a'; // Char use single quotes! Takes in one character

         
         
         // These are other data types we don't use as much
         float floatnum = 3; // Initalizes as an integer, but can hold decimals (All real numbers)
         long longnum = 9; // This is an integer
         short shortnum = 3; // Also an integer, but with less memory
         
         
         
         // White space (spaces, tabs, new lines) are not considered by Java, but should be used to organize code:
         System                       .out. println            (        "I'm not formatted right :D" )                                       ;
         System.out.println("I am formatted right");
         
         
         
         // Strings are objects, not a data type, so they look different:
         // --> Objects are declared something similar to this: Class id = memory constructor("string");
         String stringstuff = new String("I'm a string!");
         
         // --> A wrapper class is an object representing data types so that we can do things to them that we can't do to normal data types
         Integer intwrap = new Integer(47);
         Double doubwrap = new Double(20.321);
         
         
         
         // --> String methods:
         // --> --> Note that methods are functions! When a function is attached to an object, it is called a method.
         // --> --> Remember that the computer starts counting at 0, not 1 (indexing).
         
         // The .length() method attached to the end of a string id returns the length of that string
         System.out.println(stringstuff.length()); 
         
          // The .toUpperCase() method returns everything UPPERCASE
         System.out.println(stringstuff.toUpperCase());
        
         // --> --> The .substring (x, y) method only includes x position to the y position, if y isn't there, it will include x position to the end of the string
         System.out.println(stringstuff.substring(2));
         System.out.println(stringstuff.substring(2, 8));

         // --> the .substring(x, y) finds the location of the y character x, if y isn't there, it will find the location of the FIRST character x
         System.out.println(stringstuff.indexOf("i")); // Finds the location of the FIRST character of i; if the letter isn't there, Java will return -1.
         System.out.println(stringstuff.indexOf("i", 2)); // Finds the location of the SECOND character of i
         
         // --> the y.compareTo(x); subtracts amount of character ASCII values (not going to put that out)
         
         
         // Formatters
         DecimalFormat fmt = new DecimalFormat("0.###"); // Zeros PAD with extra zeros, hashtags are the places in which the numbers are rounded to
         DecimalFormat fmt2 = new DecimalFormat("0.000");
         
         NumberFormat money = NumberFormat.getCurrencyInstance();
         NumberFormat percent = NumberFormat.getPercentInstance();
         
         
         
         // Scanner!
         Scanner keyboard = new Scanner(System.in); // Initalizes a scanner input by the name of keyboard
         // --> Inputting one number in a line
         int x = keyboard.nextInt(); //.next() reads up to the next space
         System.out.println("You put in: " + x ); //nextLine() reads to the next \n
         
         // --> Inputting words in a line (returns as string)
         String keyboardInput = keyboard.nextLine();
         System.out.println("You put in: " + keyboardInput);
         
         // --> Inputting three numbers in the same line
         System.out.print("Enter 3 numbers, seperated by white space: ");
         x = keyboard.nextInt();
         int y = keyboard.nextInt(); 
         int z = keyboard.nextInt();
         System.out.print("You put: " + x + y + z);
         
         
         
         // Random Numbers
         Random gen = new Random();
         x = gen.nextInt(100); // Generates random number from 0 to 99
         System.out.println(x);
         
         doubnum = gen.nextDouble(); // Generates random number from 0.0000000000000000000001-1 non inclusive
         System.out.println(y);
         
         
         
         // (some) MATH
         System.out.println(Math.pow(4, 2)); // Displays 4^2
         System.out.println(Math.sqrt(9)); // Takes the square root of 9
         System.out.println(Math.abs(-20)); // Takes the absolute value of -20
         
         // Promotions and Casting
         x = 5;
         y = 9;
         
         System.out.print("Enter fahrenheit temp");
         int f = keyboard.nextInt();
         // double c = (f - 32) * (5/9); // Int division, 5/9 will return zero
         double c1 = (f - 32) * (5.0/9.0); // Promotion, 5 becomes 5.0, etc., which promotes it from an integer to a floating number
         double c2 = (f - 32) * ((double)x/y); // Variables can't promote! We can cast x to a double ONLY for the equation, temporarly.
         System.out.print("The celsius temp is (promotion): " + c1);
         System.out.print("The celsius temp is (var casting): " + c2);
         
         // 
    }
}
