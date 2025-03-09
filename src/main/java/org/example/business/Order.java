package org.example.business;

import org.example.business.products.Garment;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

/**
 * Represents the shopping cart of a customer.
 */
public class Order {
    private ArrayList<Garment> garments = new ArrayList<>();
    private Customer customer;
    private String name;
    private int id;
    private PropertyChangeSupport changeSupport;

    public Order() {}

    public Order(Customer customer, int id) {
        this.changeSupport = new PropertyChangeSupport(this);
        this.customer = customer;
        this.id = id;
    }

    public void addGarment(Garment garment) {
        this.garments.add(garment);
    }

    public boolean isEmpty() {
        return garments.isEmpty();
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
