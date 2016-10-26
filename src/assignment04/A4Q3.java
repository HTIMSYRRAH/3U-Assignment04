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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create scanner
        Scanner input = new Scanner(System.in);
        // ask for numbers
        System.out.println("Please enter 4 numbers on seperate lines:");
        Double numberOne = input.nextDouble();
        Double numberTwo = input.nextDouble();
        Double numberThree = input.nextDouble();
        Double numberFour = input.nextDouble();
        // show numbers
        System.out.println("Your numbers were " + numberOne + ", " + numberTwo + ", " + numberThree + ", " + numberFour + ".");
    }
}
