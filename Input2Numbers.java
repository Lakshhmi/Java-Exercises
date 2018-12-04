package ExNov24;
import java.util.Scanner;
public class Input2Numbers {
    public static void main(String[] argS){

        Scanner input = new Scanner(System.in);
        System.out.println("Input first number");
        int x = input.nextInt();
        System.out.println("Input second number");
        int y = input.nextInt();
        int z =x*y;
        System.out.println("Product of " +x+ " and " +y +" = "+ z);

        //Getting Float input
        System.out.println("Enter float :");
        float myFloat = input.nextFloat();
        System.out.println("Entered Float number " + myFloat);

        //Getting double input
        System.out.println("Enter double ");
        double myDouble = input.nextDouble();
        System.out.println("Entered Double number " + myDouble);
    }
}
