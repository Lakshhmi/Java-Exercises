package com.basic2.empmngsystem;

public class HR implements My_Observer {
    @Override
    public void call(Employee Emp, String Status) {
        System.out.println("HR Department notified");
    }
}
