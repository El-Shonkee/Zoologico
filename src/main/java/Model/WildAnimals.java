/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andrea.correaa1
 */
public class WildAnimals extends Animals {
   String habitat, dietType;
   int danger;

    public WildAnimals(String name, String type, String species, float weight, int quantity, float age, String habitat, String dietType, int danger) {
        super(name, type, species, weight, quantity, age);
        this.habitat = habitat;
        this.dietType = dietType;
        this.danger = danger;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public int getDanger() {
        return danger;
    }

    public void setDanger(int danger) {
        this.danger = danger;
    }
}
