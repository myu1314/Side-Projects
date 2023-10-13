/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Calculates max height
  
  
*/

import java.util.Scanner;

public class verticalDistanceCalcuator {
    public static void main(String[] args) throws Exception {
        // Input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your intial position? (m) ");
        double yi = keyboard.nextDouble();

        System.out.print("What is your intial velocity? (m/s) ");
        double vi = keyboard.nextDouble();

        System.out.print("How long does it take for the object to reach its max height? (s) ");
        double t = keyboard.nextDouble();

        System.out.print("What is the acceleration due to gravity? (m/s^2) ");
        double g = keyboard.nextDouble();
        // Using one of the 5 main kinetic energy equations
        double yf = 1/2.0f * g * t * t + vi * t + yi;

        // Output
        System.out.printf("The max height is %4.2f m\n", yf);

        keyboard.close();
     }
}
/*
 * ****************************OUTPUT**************************************
 * What is your intial position? (m) 5
 * What is your intial velocity? (m/s) 10
 * How long does it take for the object to reach its max height? (s) 3
 * What is the acceleration due to gravity? (m/s^2) 9.81
 * The max height is 79.15 m
 */