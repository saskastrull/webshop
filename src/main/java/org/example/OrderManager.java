package org.example;

import org.example.builders.PantsBuilder;
import org.example.builders.SkirtBuilder;
import org.example.builders.TShirtBuilder;
import org.example.business.Customer;
import org.example.business.Order;
import org.example.business.products.Garment;
import org.example.business.products.Pants;
import org.example.business.products.Skirt;
import org.example.business.products.TShirt;
import org.example.constants.general.Color;
import org.example.constants.general.Material;
import org.example.constants.general.Size;

import java.beans.PropertyChangeSupport;
import java.util.Scanner;

/**
 * Class which handles the ordering process.
 */
public class OrderManager {
    private Color color;
    private Material material;
    private Size size;
    private final Customer customer;
    private Order order;
    private OrderObserver orderObserver;
    private PropertyChangeSupport support;

    public OrderManager(Customer customer) {
        this.customer = customer;
        this.support = new PropertyChangeSupport(this);
    }

    public void orderProcess() {
        boolean closeOrder = false; // If process should exit or continue to loop
        Scanner scanner = new Scanner(System.in);

        while (!closeOrder) {
            System.out.println("0. EXIT\n1. TSHIRTS\n2. PANTS\n3. SKIRTS\n4. PLACE ORDER");
            int choice = scanner.nextInt();

            if (choice == 4) {
                if (this.order == null){ // If customer attempts to place order with empty cart
                    System.out.println("PLEASE ADD SOMETHING TO YOUR CART");
                }
                else {
                    placeOrder();
                    closeOrder = true;
                }
            }
            else if ((choice == 1 || choice == 2 || choice == 3)) {
                produceGarment(choice); // Begins process for sewing new garment
            }
            else {
                scanner.close();
                System.out.println("ORDER CANCELLED");
                closeOrder = true;
            }

            // om PANTS: välj längd -> välj fit
            // om SKIRT: välj waistline -> välj pattern
            // om TSHIRT: välj sleeves -> välj neck
            // KÖR COMMANDS... ändra priset på plagget...

            // shop more (kör om loop)
            // complete order (SKAPAR ORDER OCH RECEIPT? meddelar CEO genom observer)
        }
    }

    private void produceGarment(int type) {
        // Check if order doesn't exist
        if (this.order == null) {
            this.order = new Order();
            System.out.println("CREATING NEW ORDER");
        }
        System.out.println("ADDING GARMENT TO ORDER");
        switch (type) {
            case 1: buildTShirt();
            case 2: buildPants();
            case 3: buildSkirt();
        }
    }

    private void buildTShirt() {
        TShirtBuilder builder = new TShirtBuilder();
        customizeBasics();
        TShirt tshirt = builder
                .addColor(color)
                .addSize(size)
                .addMaterial(material)
                .build();
    }

    private void buildSkirt() {
        SkirtBuilder builder = new SkirtBuilder();
        customizeBasics();
        Skirt skirt = builder
                .addColor(color)
                .addSize(size)
                .addMaterial(material)
                .build();
    }

    private void buildPants() {
        PantsBuilder builder = new PantsBuilder();
        customizeBasics();
        Pants pants = builder
                .addColor(color)
                .addSize(size)
                .addMaterial(material)
                .build();
    }

    // Get color, material and size from user
    private void customizeBasics() {

        System.out.println("PICK COLOR:\n1. ");

        System.out.println("PICK MATERIAL:\n1. ");

        System.out.println("PICK SIZE:\n1. ");
    }

    // Command customization
    private void customizeExtra() {

    }

    private void placeOrder() {
        System.out.println("kvitto här");
    }

    public void addGarment(Garment garment) {
        support.firePropertyChange("gamrnet", this.order, garment);
        order.addGarment(garment);
    }

    public OrderObserver getOrderObserver() {
        return orderObserver;
    }

    public void setOrderObserver(OrderObserver orderObserver) {
        this.orderObserver = orderObserver;
    }

    public void addOrderObserver(OrderObserver orderObserver) {
        support.addPropertyChangeListener(orderObserver);
    }

    public void removeOrderObserver(OrderObserver orderObserver) {
        support.removePropertyChangeListener(orderObserver);
    }
}
