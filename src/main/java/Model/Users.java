/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author andrea.correaa1
 */
public class Users extends People {
    int concurrency;

    public Users(String name, Date age, String id, int concurrency) {
        super(name, age, id);
        this.concurrency = concurrency;
    }

    public Users(){
    }

    public int getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(int concurrency) {
        this.concurrency = concurrency;
    }
}


