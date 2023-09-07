/*
    Author: Mark Yu
    Last Updated: 9/7/2023
    Description: Calculates hypontuse
  
  
*/

import java.util.Scanner;

public class pythagoreanTheorem {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Length of A: ");
        double a = keyboard.nextDouble();
        System.out.print("Length of B: 3");
        double b = keyboard.nextDouble();
        double c = Math.sqrt(a*a + b*b);
        System.out.print("The length of the hypontuse = " + c + ".");
     }
}
/*
****************************OUTPUT**************************************
    Length of A: 3
    Length of B: 4
    The length of the hypontuse = 5.0.
 */