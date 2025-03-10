package org.example;

import org.example.business.CEO;
import org.example.business.Customer;
import org.example.business.Order;

import java.util.Scanner;

/**
 * Main website where the customer logs in to the system.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("0. EXIT \n1. LOGIN");
        if (scanner.nextInt() == 1) {
            scanner.nextLine();
            System.out.println("ENTER YOUR NAME: ");
            String name = scanner.nextLine();

            // Create customer from name
            IDManager idManager = IDManager.getInstance();
            Customer customer = new Customer(name, idManager.generateID());
            System.out.println("LOGGING IN AS " + name);

            System.out.println("0. EXIT \n1. BEGIN ORDER");
            if (scanner.nextInt() == 1) {
                Order order = new Order(customer, idManager.generateID());
                CEO ceo = new CEO("Nadjaturb", idManager.generateID());

                // Set up observer
                OrderObserver orderObserver = new OrderObserver(ceo);
                order.addPropertyChangeSupport(orderObserver);

                OrderManager orderManager = new OrderManager(customer, order);
                // Begin ordering process
                orderManager.orderProcess();
            }
            else {
                System.out.println("LOGGED OUT");
            }
        }
        else {
            System.out.println("EXITED");
        }
    }
}