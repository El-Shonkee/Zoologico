package Model;

import java.util.ArrayList;
import java.util.Date;

public class Ticket {

    int id;
    boolean price;
    Date timeCreated;
    ArrayList<Ticket> ticketList = new ArrayList<Ticket>();

    public Ticket(boolean price, Date timeCreated, int id) {
        this.price = price;
        this.timeCreated = timeCreated;
        this.id = id;
    }

    public boolean isPrice() {
        return price;
    }

    public void setPrice(boolean price) {
        this.price = price;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
