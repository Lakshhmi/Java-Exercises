package com.basic2.empmngsystem;

public class EmployeeNotifier implements Notifier{
    @Override
    public void AddObserver() {

    }

    @Override
    public void RemoveObserver() {

    }

    @Override
    public void Notifier(Employee Emp, String Status) {
        HR objHR = new HR();
        objHR.call(Emp,Status);

    }
}
