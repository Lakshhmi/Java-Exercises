import java.util.Scanner;

public class Multiplication{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int i,x;
		System.out.println("Enter an integer for Multiplication Table");

		x = input.nextInt();
		System.out.println(x + " Multiplication Table");
		
		for(i=1;i<=10;i++){
			
			System.out.println("     " +  i + " x " + x + " = " + (i*x) );
		}		
		
	}
 
}