package ExNov24;

public class Methods {
    public int a = 0;
    public int b = 0;
    public int c = 0;

    public static void main(String[] args) {

        System.out.println("Methods :");
        Methods methodObj = new Methods();
        methodObj.method1();
        methodObj.method2();
        methodObj.method3();
        System.out.println("Sum of Methods = " + (methodObj.a + methodObj.b + methodObj.c));

    }

        public  void method1() {
            int x = 10;
            int y = 3;
            a = x + y;
            System.out.println("Method 1 = " + a);
        }
        public  void method2() {
            int x = 5;
            int y = 6;
            b = x * y;
            System.out.println("Method 2 = " + b);
        }
        public  void method3() {
            int x = 20;
            int y = 14;
            c = x - y;
            System.out.println("Method 3 = " + c);

        }

}



