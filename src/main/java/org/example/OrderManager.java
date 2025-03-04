package org.example;

import org.example.business.Customer;
import org.example.business.Order;
import org.example.business.products.Garment;

/**
 *
 */
public class OrderManager {
    private Customer customer;
    private Order order;

    // Eager creation
    private static final OrderManager INSTANCE = new OrderManager();
    private OrderManager() {}

    public static OrderManager getInstance() {
        return INSTANCE;
    }

    public void processOrder() {
    }

    public void addGarment(Garment garment) {
        order.addGarment(garment);
    }
}
