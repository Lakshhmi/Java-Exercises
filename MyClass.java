package JavaOOPsConcepts;

//import static JavaOOPsConcepts.Person.work;

public class MyClass {


    public static void main(String[] args){
        System.out.println("From main class");
        //Arithmetic Calculation
        ArithmeticCalculation objAC = new ArithmeticCalculation();
        System.out.println("Addition " + (objAC.i + objAC.j));


        //Call Person class
        Person objP = new Person();
        System.out.println((objP.fName + " " + objP.lName) + " is " + objP.Age + " years old.");
        objP.work();

        //Call Car Class - Constructor class with parameters
        Car myCar = new Car(2010, "Honda");

//        Print Model name and year
        System.out.println("My car is " + myCar.modelName + " " + myCar.modelYear + " model");
    }
}
