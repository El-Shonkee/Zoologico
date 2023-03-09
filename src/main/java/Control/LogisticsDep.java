/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Animals;
import Model.People;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author andrea.correaa1
 */
public class LogisticsDep extends People {
    String workCode;
    double salary;
    ArrayList<LogisticsDep> logisticsDepList = new ArrayList<LogisticsDep>();

    public LogisticsDep(String name, Date age, String id, String workCode, double salary) {
        super(name, age, id);
        this.workCode = workCode;
        this.salary = salary;
    }
    public LogisticsDep() {
    }

    private addAnimal(){

    }
    private modifyAimal(){

    }
    private relocateAnimal(){

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
