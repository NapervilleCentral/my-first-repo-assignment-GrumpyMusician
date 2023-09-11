
/**
 * Andy Liang
 * 09/11/23
 * Random Phone Number
 * Generates a random phone number if you want to call random people
 */

import java.util.Random;

public class sololabs_randPhoneNumber
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        
        // Initiates new strings
        String sectionOne = new String();
        String sectionTwo = new String();
        String sectionThree = new String();
        
        // Generates portions of a phone number
        sectionOne = String.valueOf(generator.nextInt(8)) + String.valueOf(generator.nextInt(8)) + String.valueOf(generator.nextInt(8));
        sectionTwo = String.valueOf(generator.nextInt(8)) + String.valueOf(generator.nextInt(5)) + String.valueOf(generator.nextInt(3));
        sectionThree = String.valueOf(generator.nextInt(10)) + String.valueOf(generator.nextInt(10)) + String.valueOf(generator.nextInt(10)) + String.valueOf(generator.nextInt(10));
        
        // Connects the three sections of the phone number and prints it out
        System.out.println(sectionOne +"-"+ sectionTwo +"-"+ sectionThree);
    }
}
/**
 * OUTPUT ONE:
 *   501-511-3356
 *   
 * OUTPUT TWO:
 *   237-321-0214
 */