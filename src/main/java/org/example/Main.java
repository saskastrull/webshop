package org.example;

import org.example.business.Customer;

import java.util.Scanner;

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

            // Start ordering process or exit
            System.out.println("0. EXIT \n1. BEGIN ORDER");
            if (scanner.nextInt() == 1) {
                // Start the ordering process
                OrderManager orderManager = new OrderManager(customer);
                orderManager.orderProcess();
            }
        }
        else {
            System.out.println("EXITED");
        }
    }
}