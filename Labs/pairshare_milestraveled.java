
/**
 * Write a description of class pairshare_milestraveled here.
 *
 * @author: Aarit, Andy
 * @version: 08/30/23
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class pairshare_milestraveled
{
    public static void main(String[] args)
    {
        // Intializes a scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Defines distance
        double dist = 5;
        
        
        // Gathers inputs from user
        System.out.println("What period of time? ");
        int period = keyboard.nextInt();
        
        System.out.println("What is your beginning milage? ");
        double beginning = keyboard.nextDouble();
        
        System.out.println("What is your ending milage? ");
        double ending = keyboard.nextDouble();
        
        System.out.println("How many days of work? ");
        int workDays = keyboard.nextInt();
        
        // Calculating personal miles
        double workMiles = workDays * dist * 2;
        double personalMiles = (ending - beginning) - workMiles;
        
        double workMilesPer = workMiles / (ending - beginning);
        double personalMilesPer = 1 - workMilesPer;
        
        // Defines a formatter to format miles
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        // Outputs percentage of car's usage
        System.out.println("Percentage of car's use for work: " + fmt.format(workMilesPer) + "%");
        System.out.println("Percentage of car's use for personal: " + fmt.format(personalMilesPer) + "%");
    }
}
