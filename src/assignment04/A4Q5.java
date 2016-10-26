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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Ask user for their name
        System.out.println("Please enter your name.");
        String name = input.nextLine();
        //Ask for users first test score
        System.out.println("What was the first test out of?");
        double testOne = input.nextInt();
        System.out.println("What was your mark?");
        double scoreOne = input.nextInt();
        //ask user for their second test score
        System.out.println("What was the second test out of?");
        double testTwo = input.nextInt();
        System.out.println("What was your mark?");
        double scoreTwo = input.nextInt();
        //ask user for third test score
        System.out.println("What was the third test out of?");
        double testThree = input.nextInt();
        System.out.println("What was your mark?");
        double scoreThree = input.nextInt();
        //ask user for their fourth test score
        System.out.println("What was the fourth test out of?");
        double testFour = input.nextInt();
        System.out.println("What was your mark?");
        double scoreFour = input.nextInt();
        //ask user for their fifth test score
        System.out.println("What was the fifth test out of?");
        double testFive = input.nextInt();
        System.out.println("What was your mark?");
        double scoreFive = input.nextInt();
        // calculate percentages
        double percentOne = ((scoreOne/testOne)*100);
        double percentTwo = ((scoreTwo/testTwo)*100);
        double percentThree = ((scoreThree/testThree)*100);
        double percentFour = ((scoreFour/testFour)*100);
        double percentFive = ((scoreFive/testFive)*100);
        // display users marks
        System.out.println("Test marks for " + name);
        System.out.println("Test 1: " + percentOne);
        System.out.println("Test 2: " + percentTwo);
        System.out.println("Test 3: " + percentThree);
        System.out.println("Test 4: " + percentFour);
        System.out.println("Test 5: " + percentFive);
        //calculate overall average
        double totalPercent = (percentOne + percentTwo + percentThree + percentFour + percentFive)/5;
        System.out.println("Average: " + totalPercent);
    }
}
