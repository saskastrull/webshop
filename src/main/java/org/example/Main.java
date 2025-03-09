package org.example;

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
                OrderManager orderManager = new OrderManager(customer, new Order(customer, idManager.generateID()));
                // Set up observer through OrderManager
                OrderObserver orderObserver = new OrderObserver();
                orderManager.setOrderObserver(orderObserver);
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