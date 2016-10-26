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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        //ask for the speed limit and the cars speed
        System.out.println("Please enter the speed limit");
        int speedLimit = input.nextInt();
        System.out.println("What was the recorded speed of the car");
        int carSpeed = input.nextInt();
        //Display messages
        int speedDifference = (carSpeed - speedLimit);
        if (speedDifference >= 31){
            System.out.println("You are speeding. Your fine is $500");
        } else if (speedDifference >= 21){
            System.out.println("You are speeding. Your fine is $270");
        } else if (speedDifference >= 1){
            System.out.println("You are speeding. Your fine is $100");
        } else 
            System.out.println("Congratulations! You are within the speed limit.");
}
}