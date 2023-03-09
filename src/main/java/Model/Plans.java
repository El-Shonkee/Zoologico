/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author andrea.correaa1
 */
public class Plans {
    int idPlan;
    String namePlan;
    String descriptionPlan;
    String days;
    String hours;
    String duration;
    int pricePlan;
    int accountingPeople;
    double priceSubscription;
    double priceAdultTicket;
    double priceChildTicket;
    String souvenir;
    double priceSouvenir;

    public Plans(int idPlan, String namePlan, String descriptionPlan, String days, String hours, String duration, int pricePlan, int accountingPeople, double priceSubscription, double priceAdultTicket, double priceChildTicket, String souvenir, double priceSouvenir) {
        this.idPlan = idPlan;
        this.namePlan = namePlan;
        this.descriptionPlan = descriptionPlan;
        this.days = days;
        this.hours = hours;
        this.duration = duration;
        this.pricePlan = pricePlan;
        this.accountingPeople = accountingPeople;
        this.priceSubscription = priceSubscription;
        this.priceAdultTicket = priceAdultTicket;
        this.priceChildTicket = priceChildTicket;
        this.souvenir = souvenir;
        this.priceSouvenir = priceSouvenir;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNamePlan() {
        return namePlan;
    }

    public void setNamePlan(String namePlan) {
        this.namePlan = namePlan;
    }

    public String getDescriptionPlan() {
        return descriptionPlan;
    }

    public void setDescriptionPlan(String descriptionPlan) {
        this.descriptionPlan = descriptionPlan;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPricePlan() {
        return pricePlan;
    }

    public void setPricePlan(int pricePlan) {
        this.pricePlan = pricePlan;
    }

    public int getAccountingPeople() {
        return accountingPeople;
    }

    public void setAccountingPeople(int accountingPeople) {
        this.accountingPeople = accountingPeople;
    }

    public double getPriceSubscription() {
        return priceSubscription;
    }

    public void setPriceSubscription(double priceSubscription) {
        this.priceSubscription = priceSubscription;
    }

    public double getPriceAdultTicket() {
        return priceAdultTicket;
    }

    public void setPriceAdultTicket(double priceAdultTicket) {
        this.priceAdultTicket = priceAdultTicket;
    }

    public double getPriceChildTicket() {
        return priceChildTicket;
    }

    public void setPriceChildTicket(double priceChildTicket) {
        this.priceChildTicket = priceChildTicket;
    }

    public String getSouvenir() {
        return souvenir;
    }

    public void setSouvenir(String souvenir) {
        this.souvenir = souvenir;
    }

    public double getPriceSouvenir() {
        return priceSouvenir;
    }

    public void setPriceSouvenir(double priceSouvenir) {
        this.priceSouvenir = priceSouvenir;
    }
}
