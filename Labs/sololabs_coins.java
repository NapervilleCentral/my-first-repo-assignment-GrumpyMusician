
/**
 * Write a description of class sololabs_coins here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class sololabs_coins
{
    public static void main(String[] args)
    {
        // Makes a new scanner called coinInput
        Scanner coinInput = new Scanner(System.in);
        
        
        // Gathers inputs for each coin as integers
        System.out.println("How many dollar coins do you have?");
        int dollarCoins = coinInput.nextInt();
        
        System.out.println("How many quarters do you have?");
        int quarters = coinInput.nextInt();
        
        System.out.println("How many dimes do you have?");
        int dimes = coinInput.nextInt();
        
        System.out.println("How many nickels do you have?");
        int nickels = coinInput.nextInt();
        
        System.out.println("How many pennies do you have?");
        int pennies = coinInput.nextInt();
        
        
        // Calculates the dollar amount from coins
        double total = dollarCoins + (quarters * 0.25) + (dimes * 0.1) + (nickels * 0.25) + (pennies * 0.25);
        
        // Outputs total, formatted.
        NumberFormat coinFmt = NumberFormat.getCurrencyInstance();
        System.out.println("Your total amount is: " + coinFmt.format(total));
    }
}
