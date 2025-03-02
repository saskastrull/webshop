package org.example;

import org.example.products.Garment;

import java.util.ArrayList;

/**
 * Represents a single order (the shopping cart) of one customer.
 */
public class OrderManager {
    private Customer customer;
    private ArrayList<Garment> garments = new ArrayList<>();

    // Eager creation
    private static final OrderManager INSTANCE = new OrderManager();
    private OrderManager() {}

    public static OrderManager getInstance() {
        return INSTANCE;
    }

    public void processOrder() {
    }

    private void addGarment() {

    }

    public void setGarments(ArrayList<Garment> garments) {
        this.garments = garments;
    }

    public ArrayList<Garment> getGarments() {
        return garments;
    }
}
