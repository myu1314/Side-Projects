/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Calculates max height
  
  
*/

import java.util.Scanner;

public class verticalDistanceCalcuator {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your intial position? (m) ");
        double yi = keyboard.nextDouble();
        System.out.print("What is your intial velocity? (m/s) ");
        double vi = keyboard.nextDouble();
        System.out.print("How long does it take for the object to reach its max height? (s) ");
        double t = keyboard.nextDouble();
        System.out.print("What is the acceleration due to gravity? (m/s^2) ");
        double g = keyboard.nextDouble();
        double yf = 1/2.0f * g * t * t + vi * t + yi;
        System.out.printf("The max height is %4.2f\n", yf);
        System.out.printf(" 0G: %.2f\n t: %.2f\nyi: %.2f\nvi: %.2f\n", g, t, yi, vi);

     }
}
/*
1/2at^2 + vit + y = yf
 * ****************************OUTPUT**************************************
 * What is your first name and last name? walter savitch
* Your name in Pig Latin is: Alterway Avitchsay
 */