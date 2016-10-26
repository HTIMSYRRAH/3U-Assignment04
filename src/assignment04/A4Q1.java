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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a scanner for input
        Scanner input = new Scanner(System.in);
        // ask for users name
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        //Say hello
        System.out.println("Hello " + name + ". How are you today?");
                
    }
}
