package ExDec01;
import java.util.Scanner;

// Write a program to convert inches to meter

public class ConvertInch2Meter {
    public static void main(String[] argS){
        System.out.println("Enter a number in Inches :");
        Scanner input = new Scanner(System.in);

        float inches = input.nextFloat();
        // One inch is 0.0254;
        double meter = inches * 0.0254;

        System.out.println(inches + " inches is " + meter + " meter");
    }
}

