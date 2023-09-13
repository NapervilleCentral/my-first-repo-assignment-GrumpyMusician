
/**
 * Andy Liang
 * 09/12/23
 * Name
 * Returns name inputted by user, with a middle initial
 */

import java.util.Scanner;

public class sololabs_name
{
    public static void main(String[] args)
    {
        // Defines new strings for each section of the name, with a scanner
        String sectionThree = new String();
        String sectionOne = new String();
        String sectionTwo = new String();
        Scanner input = new Scanner(System.in);
        
        // Gathers full name from user
        System.out.println("Input in your full name (first, middle, last, seperated by white space:)");
        sectionThree = input.nextLine(); 
        
        // Splits the string into three section based off of spaces
        int spaceIndex = sectionThree.indexOf(" ");
        sectionOne = sectionThree.substring(0, spaceIndex);
        sectionThree = sectionThree.substring(spaceIndex+1);
        
        spaceIndex = sectionThree.indexOf(" ");
        sectionTwo = sectionThree.substring(0, spaceIndex);
        sectionTwo = sectionTwo.substring(0, 1);
        sectionThree = sectionThree.substring(spaceIndex+1);
        
        System.out.println("Your name is: " + sectionOne +" "+ sectionTwo +". "+ sectionThree);
        
    }
}

/**
 * Output One:
 * Input in your full name (first, middle, last, seperated by white space:)
 * Olympic Titanic Britannic
 * Your name is: Olympic T. Britannic
 * 
 * Output Two:
 * Input in your full name (first, middle, last, seperated by white space:)
 * The Old Reliable
 * Your name is: The O. Reliable
 */

