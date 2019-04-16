package com.basic2.empmngsystem;

public class Employee {
    String FName;
    String LName;
    String Doj;
    String Status;

    public Employee(String FName, String LName, String doj, String status) {
        this.FName = FName;
        this.LName = LName;
        this.Doj = doj;
        this.Status = status;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getDoj() {
        return Doj;
    }

    public void setDoj(String doj) {
        this.Doj = doj;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }
}
