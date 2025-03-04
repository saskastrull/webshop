package org.example.business;

import org.example.business.products.Garment;

import java.util.ArrayList;

/**
 * Represents the shopping cart of the customer.
 */
public class Order {
    private ArrayList<Garment> garments = new ArrayList<>();
    private String name;
    private int id;

    public Order() {}

    public void addGarment(Garment garment) {
        this.garments.add(garment);
    }

    public ArrayList<Garment> getGarments() {
        return garments;
    }

    public void setGarments(ArrayList<Garment> garments) {
        this.garments = garments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
