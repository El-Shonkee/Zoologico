/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.People;

import java.util.Date;

/**
 *
 * @author andrea.correaa1
 */
public class CommercialDep extends People {
    String workCode;
    double salary;

    public CommercialDep(String name, Date age, String id, String email, String phone, String workCode, double salary) {
        super(name, age, id, email, phone);
        this.workCode = workCode;
        this.salary = salary;
    }

    public CommercialDep(String workCode, double salary) {
        this.workCode = workCode;
        this.salary = salary;
    }

    public CommercialDep() {
    }

    private sellTicket(){

    }

    private sellPlan(){

    }

    public String getWorkCode() {
        return workCode;
    }

    public void setWorkCode(String workCode) {
        this.workCode = workCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
