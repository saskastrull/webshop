package org.example.business;

import org.example.business.products.Garment;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

/**
 * Class representing the shopping cart of a customer.
 */
public class Order {
    private ArrayList<Garment> garments;
    private Customer customer;
    private String name;
    private int id;
    private final PropertyChangeSupport propertyChangeSupport;

    public Order() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
        this.garments = new ArrayList<>();
    }

    public Order(Customer customer, int id) {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
        this.garments = new ArrayList<>();
        this.customer = customer;
        this.id = id;
    }

    public void addPropertyChangeSupport(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void addGarment(Garment garment) {
        ArrayList<Garment> oldGarments = new ArrayList<>(garments);
        this.garments.add(garment);
        this.propertyChangeSupport.firePropertyChange("order", oldGarments, this.garments);
    }

    public boolean isEmpty() { return garments.isEmpty(); }

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

    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }
}
