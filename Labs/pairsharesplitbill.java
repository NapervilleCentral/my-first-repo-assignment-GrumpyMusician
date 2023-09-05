/**
 *
 * Aarit Tewatia and Andy Liang
 * 8/25/23
 * Pair Share prog - split the bill
 * 
 */

import java.util.Scanner;


public class pairsharesplitbill
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bill:");
        double bill = scan.nextDouble();
        System.out.println("Number of people:");
        int people = scan.nextInt();
        
        double tip = bill * 0.2;
        double total = tip + bill;
        
        System.out.println("/nSubtotal: " + bill);
        System.out.println("Tip: " + tip);
        System.out.println("Total amount: " + total);
        
        System.out.println("/nEach person pays: " + (total/people));
        System.out.println("Each person subtotal: " + (bill/people));
        System.out.println("Each person tip: " + (tip/people));
        
    }
}