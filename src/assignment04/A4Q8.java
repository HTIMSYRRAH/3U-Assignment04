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
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // place the player on the first square
        int playerPosition = 1;
        while (playerPosition < 100) {
        // move the player
        System.out.println("Please enter your roll");
        int roll = input.nextInt();
        if (roll <2){
            System.out.println("You quit.");
            break;
        }
        if (roll >12){
            System.out.println("You quit.");
            break;
        }
        if (playerPosition + roll > 100){
            System.out.println("Roll again");
        }
        else{
        playerPosition = playerPosition + roll;
        }
        System.out.println("You are now on square " + playerPosition);
        // set ladders    
        if (playerPosition == 9){
            playerPosition = 34;
                System.out.println("You landed on a ladder. You are now on square 34");
        }
        if (playerPosition == 40){
            playerPosition = 64;
                System.out.println("You landed on a ladder. You are now on square 64");
        }
        if (playerPosition == 67){
            playerPosition = 86;
                System.out.println("You landed on a ladder. You are now on square 86");
        }
        // set snakes
        if (playerPosition == 54){
            playerPosition = 19;
                System.out.println("You landed on a snake. You are now on square 19");
        }
        if (playerPosition == 90){
            playerPosition = 48;
                System.out.println("You landed on a snake. You are now on square 48");
        }
        if (playerPosition == 99){
            playerPosition = 77;
                System.out.println("You landed on a snake. You are now on square 77");
        }
}
}
}