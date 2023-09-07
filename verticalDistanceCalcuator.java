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
        System.out.print(g);
        double yf = 1/2 * g * t * t + vi * t + yi;
        System.out.print("The max height is " + yf);
     }
}
/*
1/2at + vit + y = yf
 * ****************************OUTPUT**************************************
 * What is your first name and last name? walter savitch
* Your name in Pig Latin is: Alterway Avitchsay
 */