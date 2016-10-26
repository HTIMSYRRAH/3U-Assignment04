/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author smith3577
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // ask for prices
        System.out.println("How much does the food for Prom cost?");
        int food = input.nextInt();
        System.out.println("How much does the DJ cost?");
        int DJ = input.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        int Hall = input.nextInt();
        System.out.println("How much do the decorations cost");
        int decorations = input.nextInt();
        System.out.println("How much does it cost for the staff?");
        int staff = input.nextInt();
        System.out.println("How much for miscellaneous costs?");
        int misc = input.nextInt();
        int total = food + DJ + Hall + decorations + staff + misc;
        //set ticket price
        int ticketPrice = 35;
        // find how many tickets need to be sold
        int tickets = (total/ticketPrice);
        //tell the user
        System.out.println("The total cost is $" + total + ". You will need to sell " + tickets + " tickets to break even.");
    }
}
