package com.basic2.empmngsystem;

import java.util.ArrayList;

public class EmployeeManager {
    public void addupdateEmployee(String FName,String LName,String Doj, String Status){
      DAO objDAO = new DAO();

      objDAO.EmpUpdate(FName,LName,Doj,Status);
      Employee Emp = new Employee(FName,LName,Doj,Status);

      EmployeeNotifier employeeNotifier = new EmployeeNotifier();
      employeeNotifier.Notifier(Emp,Status);
    }

}
