package ExDec01;
import java.util.Scanner;
// Choose Grade based on the testscore;
public class Conditions {
    char grade;

    public static void main(String[] argS){

        Conditions obj = new Conditions();
        obj.Getgrade();
        System.out.println(obj.grade);
    }


    public char Getgrade(){

        int testScore;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Test Score : ");
        testScore = input.nextInt();

        if(testScore >= 90 && testScore <= 100) {
            grade = 'A';

        }else if(testScore >= 80 && testScore < 90){
             grade = 'B';

        }else if(testScore >= 70 && testScore < 80) {
            grade = 'C';

        }else {
            System.out.println("Invalid Score");
        }

        return(grade);
    }
}
