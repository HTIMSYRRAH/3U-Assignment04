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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the measurement in inches you wish to convert:");
        double inches = input.nextDouble();
        double centimeters = inches* 2.54;
        System.out.println(inches + " is the same as " + centimeters + "cm");
        
    }
}
