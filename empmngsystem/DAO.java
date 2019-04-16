package com.basic2.empmngsystem;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    private static Integer Counter = 0;

    public void EmpUpdate(String FName,String LName,String Doj, String Status) {

        Counter = Counter +1;
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(FName,LName,Doj,Status));

        employeeList.forEach(employee -> {
            System.out.println("Name: " + employee.getFName() + " " + employee.getLName()+ ", Date of join: "+employee.getDoj()+ ", Status: " + employee.getStatus());
        });
        System.out.println("Total employee " + Counter);
     }

}
