
/**
 * Andy Liang
 * 09/07/23
 * Sololabs Coins
 * Calculates amount of money from coins
 * int: dollarCoins, quarters, dimes, nickels, pennies; double: total
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class sololabs_coins
{
    public static void main(String[] args)
    {
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
        double total = dollarCoins + (quarters * 0.25) + (dimes * 0.1) + (nickels * 0.05) + (pennies * 0.01);
        
        // Outputs total, formatted as currency
        NumberFormat coinFmt = NumberFormat.getCurrencyInstance();
        System.out.println("Your total amount is: " + coinFmt.format(total));
    }
}




