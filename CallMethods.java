package ExDec09;

public class CallMethods {

    // Static Methods

    // void - LearnPrint is not return anything
    static void LearnPrint(){
        System.out.println("I'm executed from LearnPrint");
    }

    // LearnParameter method takes parameter and not return anything
    static void LearnParameter(String name){
        System.out.println(name);
    }

    // int - LearnAddition returns integer
    static int LearnAddition(int x, int y){
        int z = x+y;
        return z;
    }

    public static void main(String[] argS){
        LearnPrint();
        LearnParameter("Lakshmi");
        int z = LearnAddition(3,5);
        System.out.println(z);
    }
}
