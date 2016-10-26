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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //determine the minutes used
        Scanner input = new Scanner(System.in);
        System.out.println("How many daytime minutes do you use?");
        double daytime = input.nextDouble();
        System.out.println("How many evening minutes do you use?");
        double evening = input.nextDouble();
        System.out.println("How many weeekend minutes do you use?");
        double weekend = input.nextDouble();
        
        // calculate the cost of Plan A
        double daytimeCostA = daytime - 100;
                if (daytimeCostA < 0)
                   daytimeCostA = 0;
                else
                    daytimeCostA = daytimeCostA * 25;
        double eveningCostA = evening * 15;
        double weekendCostA = weekend * 20;
        double planA = (daytimeCostA + eveningCostA + weekendCostA);
        planA = planA/100;
        
        //calcualate the cost of Plan B
        double daytimeCostB = daytime - 250;
                if (daytimeCostB < 0)
                    daytimeCostB = 0;
                else
                    daytimeCostB = daytimeCostB * 45;
        double eveningCostB = evening * 35;
        double weekendCostB = weekend * 25;
        double planB = (daytimeCostB + eveningCostB + weekendCostB);
        planB = planB/100;
        
        //display the cost of the two plans
        System.out.println("Plan A costs $" + planA);
        System.out.println("Plan B costs $" + planB);
        if (planA < planB)
            System.out.println("Plan A is cheaper");
        else if (planB < planA)
            System.out.println("Plan B is cheaper");
        else if (planA == planB)
            System.out.println("The plans cost the same amount");
    }
}
