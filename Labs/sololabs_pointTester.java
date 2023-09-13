
/**
 * Andy Liang
 * 09/13/23
 * Point Tester
 * Calculates distance between two points on a 2D plane
 * double twoPointDist, xValue, yValue;
 */

import java.awt.Point;
import java.util.Scanner;
import java.util.Random;

public class sololabs_pointTester
{
   public static void main(String[] args)
   {
       // Defines scanner, points, and random
       Scanner input = new Scanner(System.in);
       Point findDist = new Point();
       Random getRandNum = new Random();
       
       // Finds and displays distance between (3, 4) and (-3, -4)
       double twoPointDist = findDist.distance(3, 4, -3, -4);
       System.out.println("Expected Distance: 10; " + "Actual Distance: " + twoPointDist + "\n");
       
       // Generates random x and y value 
       int xRandom = getRandNum.nextInt(20) - 10;
       int yRandom = getRandNum.nextInt(20) - 10;
       
       // Calculates distance between user's point and the program's point
       System.out.println("My point is " +"(" + xRandom + ", " + yRandom+"). " + "You enter a point seperated by white space: ");
       double xUser = input.nextInt();
       double yUser = input.nextInt();
       twoPointDist = findDist.distance(xRandom, yRandom, xUser, yUser);
       System.out.println("The distance between our point is: " + twoPointDist);
   }
}
