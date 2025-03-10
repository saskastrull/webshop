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
        Scanner scanner = new Scanner(System.in);
        IDManager idManager = IDManager.getInstance();

        System.out.println("0. EXIT \n1. LOGIN");
        if (scanner.nextInt() == 1) {
            scanner.nextLine();
            System.out.println("ENTER YOUR NAME: ");
            String name = scanner.nextLine();
            Customer customer = new Customer(name, idManager.generateID());
            System.out.println("LOGGING IN AS " + name+"\n0. EXIT \n1. BEGIN ORDER");

            if (scanner.nextInt() == 1) {
                Order order = new Order(customer, idManager.generateID());
                CEO ceo = new CEO("Francis", idManager.generateID());
                // Set up observer for order
                OrderObserver orderObserver = new OrderObserver(ceo);
                order.addPropertyChangeSupport(orderObserver);
                // Begin ordering process
                OrderManager orderManager = new OrderManager(customer, order);
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