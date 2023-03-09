/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andrea.correaa1
 */
public class DomesticAnimals extends Animals {
    String color;

    public DomesticAnimals(String name, String type, String species, float weight, int quantity, float age, String color) {
        super(name, type, species, weight, quantity, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
