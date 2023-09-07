
/**
 * Andy Liang
 * 09/06/23
 * Spheres
 * Calculates the surface area and circumference of a sphere based on radius
 * double radius, volume, circumference, surfaceArea
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class sololab_spheres
{
    public static void main(String[] args){
        //Sets up a scanner and decimal format
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        // Asks for a radius
        System.out.println("What is the radius of your sphere?");
        double radius = input.nextDouble();
        
        // Defines and calculates circumference and surface area
        double volume = ((double)4/3) * Math.PI * Math.pow(radius, 3);
        double circumference = 2 * Math.PI * radius;
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        
        // Outputs circumference and surface area, formatted.
        System.out.println("The volume of your sphere is " + fmt.format(volume));
        System.out.println("The circumference of your sphere is " + fmt.format(circumference));
        System.out.println("The surface area of your sphere is " + fmt.format(surfaceArea));
    }
}
