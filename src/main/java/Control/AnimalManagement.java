/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.People;

import java.util.Date;

/**
 *
 * @author Julian Isaza Marin
 */
public class AnimalManagement extends People {
    String workCode;
    double salary;

    public AnimalManagement(String name, Date age, String id, String email, String phone, String workCode, double salary) {
        super(name, age, id,email,phone);
        this.workCode = workCode;
        this.salary = salary;
    }

    public AnimalManagement() {

    }


}
