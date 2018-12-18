package ExDec01;

//Check the number is Odd or Even

public class OddOrEven {

    public static void main(String[] args){

        int i;
        for(i=1;i<=20;i++){
            if(CheckEven(i)==true){
                System.out.println(i + " is Even number");
            }
            else{
                System.out.println(i + " is Odd Number");
            }
        }
    }

    public static boolean CheckEven(int x){

        boolean bool;

            if(x%2==0){
                bool = true;
            }
            else{
                bool = false;
            }

     return bool;
    }
}

