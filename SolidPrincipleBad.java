package SolidBadExample;

public class SolidPrincipleBad {
    public static void main(String argS[]){
//        SolidBadExample.Manager m = new SolidBadExample.Manager();
//        m.setWorker(SolidBadExample.IWorker );
//        m.manage();
        IWorker wok = new SuperWorker();
        wok.eat();
        wok.work();
    }
}

