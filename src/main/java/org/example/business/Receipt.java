package org.example.business;

import org.example.business.products.Garment;

/**
 * Class which stores and prints information about an order.
 */
public class Receipt {
    private Order order;
    private String name;
    private int id;
    private int total;

    public Receipt() {}

    public Receipt(Order order, int id) {
        this.order = order;
        this.id = id;
    }

    public void createReceipt() {
        System.out.println("RECEIPT ID: " + this.id + "\nORDER ID: " + this.order.getId());

        // Print info about garments and calculate total price
        for (Garment garment : order.getGarments()) {
            total += garment.getPrice();
            System.out.println(garment.toString());
        }

        System.out.println("TOTAL: $" + total);
        System.out.println("SHIPPING TO: " + order.getCustomer().getAddress() +
                "\nCUSTOMER CONTACT: " + order.getCustomer().getMail());
    }

    public Order getOrder() { return order; }

    public void setOrder(Order order) { this.order = order; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }
}
