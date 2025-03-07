package org.example;

import org.example.business.Customer;
import org.example.business.Order;
import org.example.business.products.Garment;

import java.util.Scanner;

/**
 * Class for handling the ordering process.
 */
public class OrderManager {
    private final Customer customer;
    private Order order;

    public OrderManager(Customer customer) {
        this.customer = customer;
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
                }
            }
            else if ((choice == 1 || choice == 2 || choice == 3)) {
                createGarment(choice); // Begins process for sewing new garment
            }
            else if (choice == 0) {
                scanner.close();
                System.out.println("ORDER CANCELLED");
                closeOrder = true;
            }

            // PANTS / TSHIRT / SKIRT / EXIT
            // assign valt värde till garmentType

            // PICK COLOR: 1 / 2 / 3
            // PICK FABRIC 1 / 2 / 3
            // PICK SIZE 1 / 2 / 3
            // KÖR RELEVANT BUILDER

            // om PANTS: välj längd -> välj fit
            // om SKIRT: välj waistline -> välj pattern
            // om TSHIRT: välj sleeves -> välj neck
            // KÖR COMMANDS... ändra priset på plagget...

            // shop more (kör om loop)
            // complete order (SKAPAR ORDER OCH RECEIPT? meddelar CEO genom observer)
        }
    }

    private void placeOrder() {
        // Fixa med observer som säger till ceo att order har lagts
        System.out.println("PLACING ORDERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
    }

    private void createGarment(int type) {
        if (this.order == null) {
            this.order = new Order(); // If first garment of order
            System.out.println("skapa ny ordäer");
        }
        System.out.println("skapa skitlplaggg");
    }

    public void addGarment(Garment garment) {
        order.addGarment(garment);
    }
}
