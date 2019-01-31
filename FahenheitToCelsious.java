package ExDec01;

//Convert Fahenheit to Celsious
import java.util.Scanner;
public class FahenheitToCelsious {
    public static void main(String[] args){

        System.out.println("Enter temperature in Fahrenheit :");

        Scanner input =new Scanner(System.in);

        float Fahrenheit = input.nextInt();
        float Celsious = ((Fahrenheit - 32) * 5) / 9;

        System.out.println("Temperature in Celsious : " + Celsious);
    }
}
