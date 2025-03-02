package org.example;

import org.example.products.Garment;

import java.util.ArrayList;

/**
 * Represents the shopping cart of the customer.
 */
public class Order {
    private ArrayList<Garment> garments = new ArrayList<>();

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
}
