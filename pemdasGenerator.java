/*
    Author: Mark Yu
    Last Updated: 10/12/2023
    Description: Generates random problem and solves it
  
  
*/

import java.util.Random;

public class PemdasGenerator {

    public static void main(String[] args) throws Exception {
        Random rand = new Random(System.currentTimeMillis());
        int sign = rand.nextInt(4); // (0 = "+", 1 = "-", 2 = "*", 3 = "/")
        double num1 = rand.nextInt(101);
        double num2 = rand.nextInt(101) ;
        double solution = 0;
        //Determing Operation and Solution
        System.out.println("The Sign Number is " + sign);
        if (sign == 0 ){
            System.out.printf("What is %2.0f + %2.0f?\n", num1, num2);
            solution = num1 + num2;
        }
        else if(sign == 1){
            System.out.printf("What is %2.0f - %2.0f?\n", num1, num2);
            solution = num1 - num2;
        }
        else if(sign == 2){
            System.out.printf("What is %2.0f * %2.0f? \n", num1, num2);
            solution = num1 * num2;
        }
        else{
            System.out.printf("What is %2.0f / %2.0f?\n", num1, num2);
            solution =  (double) num1/  (double) num2  ;
        }
        System.out.printf("The solution is %2.2f", solution);
    }
}
/*
 * ****************************OUTPUT**************************************
 * Case 1 (Subtraction)
 * What is 26 - 94?
 * The solution is -68.00
 * 
 * 
 * Case 2 (Addition)
 * What is 57 + 47?
 * The solution is 104.00
 * 
 * 
 * Case 3 (Multiplication)
 * What is 20 * 52? 
 * The solution is 1040.00
 * 
 * 
 * Case 4 (Division)
 * What is 38 / 88?
 * The solution is 0.43
 */