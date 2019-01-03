package ExDec09;

import java.util.Scanner;

// Get 3 numbers from user and find the Largest Number


public class Largest {
    public static void main(String[] args){
        int First,Second,Third;

        System.out.println("Enter 3 numbers :");
        Scanner input = new Scanner(System.in);
        First = input.nextInt();
        Second = input.nextInt();
        Third = input.nextInt();


        LNumber(First,Second,Third);
    }

    static void LNumber(int x, int y, int z){

        if(x > y && x> z){
            System.out.println(x + " is a Largest Number");
        }else if(y > x && y > z){
            System.out.println(y + " is a Largest Number");
        }else if(z > x && z > x){
            System.out.println(z + " is a Largest Number");
        }else {
            System.out.println(" All the numbers are same");
        }

    }
}
