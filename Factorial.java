package ExDec09;

//Find factorial of given number

import java.util.Scanner;

public class Factorial {
    private static int i,n,fact = 1;

    public static void main(String[] args){
        
//      Get input from user
        System.out.println("Enter a number to find factorial");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();




        for(i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+ n + " is : " + fact);
    }
}
