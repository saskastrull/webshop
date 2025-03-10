package org.example;

import org.example.builders.PantsBuilder;
import org.example.builders.SkirtBuilder;
import org.example.builders.TShirtBuilder;
import org.example.business.Customer;
import org.example.business.Order;
import org.example.business.Receipt;
import org.example.business.products.*;
import org.example.commands.*;
import org.example.constants.general.*;
import org.example.constants.pants.*;
import org.example.constants.skirt.*;
import org.example.constants.tshirt.*;

import java.util.Scanner;

/**
 * Manager class for handling the ordering process.
 */
public class OrderManager {
    private Color color;
    private Material material;
    private Size size;
    private final Customer customer;
    private Order order;
    private final Scanner scanner;
    IDManager idManager = IDManager.getInstance();

    public OrderManager(Customer customer, Order order) {
        this.customer = customer;
        this.order = order;
        this.scanner = new Scanner(System.in);
    }

    public void orderProcess() {
        boolean closeOrder = false; // If process should exit or continue to loop

        while (!closeOrder) {
            System.out.println("0. EXIT\n1. TSHIRTS\n2. PANTS\n3. SKIRTS\n4. PLACE ORDER");
            int choice = scanner.nextInt();

            if (choice == 4) {
                if (this.order == null || this.order.isEmpty()){ // If customer attempts to place order with empty cart
                    System.out.println("PLEASE ADD SOMETHING TO YOUR CART");
                }
                else {
                    getCustomerDetails();
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
        }
    }

    private void produceGarment(int type) {
        // Check if order doesn't exist
        if (this.order == null) {
            this.order = new Order(this.customer, idManager.generateID());
            System.out.println("CREATING NEW ORDER");
        }
        switch (type) {
            case 1: {
                TShirt tshirt = buildTShirt();
                addGarment(customizeTShirt(tshirt));
                break;
            }
            case 2: {
                Pants pants = buildPants();
                addGarment(customizePants(pants));
                break;
            }
            case 3: {
                Skirt skirt = buildSkirt();
                addGarment(customizeSkirt(skirt));
                break;
            }
            default: {
                System.out.println("INVALID CHOICE, DEFAULTING TO PANTS.");
                Pants pants = buildPants();
                addGarment(customizePants(pants));
            }
        }
    }

    private TShirt buildTShirt() {
        TShirtBuilder builder = new TShirtBuilder();
        customizeBasics();
        return builder
                .addName("TSHIRT")
                .addId(idManager.generateID())
                .addColor(color)
                .addSize(size)
                .addMaterial(material)
                .build();
    }

    private Skirt buildSkirt() {
        SkirtBuilder builder = new SkirtBuilder();
        customizeBasics();
        return builder
                .addName("SKIRT")
                .addId(idManager.generateID())
                .addColor(color)
                .addSize(size)
                .addMaterial(material)
                .build();
    }

    private Pants buildPants() {
        PantsBuilder builder = new PantsBuilder();
        customizeBasics();
        return builder
                .addName("PANTS")
                .addId(idManager.generateID())
                .addColor(color)
                .addSize(size)
                .addMaterial(material)
                .build();
    }

    // Get color, material and size from user
    private void customizeBasics() {
        // Get color
        System.out.println("PICK COLOR:\n1. GREEN\n2. BLACK\n3. BLUE");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                color = Color.GREEN;
                break;
            case 2:
                color = Color.BLACK;
                break;
            case 3:
                color = Color.BLUE;
                break;
            default:
                System.out.println("INVALID CHOICE, DEFAULTING TO GREEN.");
                color = Color.GREEN;
        }

        // Get material
        System.out.println("PICK MATERIAL:\n1. COTTON\n2. CHAINMAIL\n3. PLASTIC");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                material = Material.COTTON;
                break;
            case 2:
                material = Material.CHAINMAIL;
                break;
            case 3:
                material = Material.PLASTIC;
                break;
            default:
                System.out.println("INVALID CHOICE, DEFAULTING TO COTTON.");
                material = Material.COTTON;
        }

        // Get size
        System.out.println("PICK SIZE:\n1. SMALL\n2. MEDIUM\n3. LARGE");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                size = Size.SMALL;
                break;
            case 2:
                size = Size.MEDIUM;
                break;
            case 3:
                size = Size.LARGE;
                break;
            default:
                System.out.println("INVALID CHOICE, DEFAULTING TO MEDIUM.");
                size = Size.MEDIUM;
        }
    }

    // Pants commands
    private Pants customizePants(Pants pants) {
        GarmentCustomizationPipeline pipeline = new GarmentCustomizationPipeline();
        // Set fit
        System.out.println("PICK FIT:\n1. SKINNY\n2. BAGGY");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                pipeline.addCommand(new FitCommand(Fit.SKINNY.name()));
                break;
            case 2:
                pipeline.addCommand(new FitCommand(Fit.BAGGY.name()));
                break;
            default:
                System.out.println("INVALID CHOICE, DEFAULTING TO BAGGY.");
                pipeline.addCommand(new FitCommand(Fit.BAGGY.name()));
        }

        // Set length
        System.out.println("PICK LENGTH:\n1. SHORT\n2. LONG");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                pipeline.addCommand(new LengthCommand(Length.SHORT.name()));
                break;
            case 2:
                pipeline.addCommand(new LengthCommand(Length.LONG.name()));
                break;
            default:
                System.out.println("INVALID CHOICE, DEFAULTING TO LONG.");
                pipeline.addCommand(new LengthCommand(Length.LONG.name()));
        }

        pipeline.execute(pants);
        return pants;
    }

    // Skirt commands
    private Skirt customizeSkirt(Skirt skirt) {
        GarmentCustomizationPipeline pipeline = new GarmentCustomizationPipeline();
        // Set pattern
        System.out.println("PICK PATTERN:\n1. GINGHAM\n2. GRADIENT");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                pipeline.addCommand(new PatternCommand(Pattern.GINGHAM.name()));
                break;
            case 2:
                pipeline.addCommand(new PatternCommand(Pattern.GRADIENT.name()));
                break;
            default:
                System.out.println("INVALID CHOICE, DEFAULTING TO GINGHAM.");
                pipeline.addCommand(new PatternCommand(Pattern.GINGHAM.name()));
        }

        // Set waistline
        System.out.println("PICK WAISTLINE:\n1. HIGH\n2. LOW");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                pipeline.addCommand(new WaistlineCommand(Waistline.HIGH.name()));
                break;
            case 2:
                pipeline.addCommand(new WaistlineCommand(Waistline.LOW.name()));
                break;
            default:
                System.out.println("INVALID CHOICE, DEFAULTING TO HIGH.");
                pipeline.addCommand(new WaistlineCommand(Waistline.HIGH.name()));
        }

        pipeline.execute(skirt);
        return skirt;
    }

    // TShirt commands
    private TShirt customizeTShirt(TShirt tshirt) {
        GarmentCustomizationPipeline pipeline = new GarmentCustomizationPipeline();

        // Set neck
        System.out.println("PICK NECK:\n1. CREW\n2. POLO");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                pipeline.addCommand(new NeckCommand(Neck.CREW.name()));
                break;
            case 2:
                pipeline.addCommand(new NeckCommand(Neck.POLO.name()));
                break;
            default:
                System.out.println("INVALID CHOICE, DEFAULTING TO POLO.");
                pipeline.addCommand(new NeckCommand(Neck.POLO.name()));
        }

        // Set sleeves
        System.out.println("PICK SLEEVES:\n1. PUFFED\n2. RIPPED");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                pipeline.addCommand(new SleevesCommand(Sleeves.PUFFED.name()));
                break;
            case 2:
                pipeline.addCommand(new SleevesCommand(Sleeves.RIPPED.name()));
                break;
            default:
                System.out.println("INVALID CHOICE, DEFAULTING TO RIPPED.");
                pipeline.addCommand(new SleevesCommand(Sleeves.RIPPED.name()));
        }

        pipeline.execute(tshirt);
        return tshirt;
    }

    private void getCustomerDetails(){
        scanner.nextLine();
        System.out.println("ENTER SHIPPING ADDRESS: ");
        customer.setAddress(scanner.nextLine());
        System.out.println("ENTER YOUR EMAIL: ");
        customer.setMail(scanner.nextLine());
    }

    private void placeOrder() {
        Receipt receipt = new Receipt(order, idManager.generateID());
        receipt.createReceipt();
    }

    public void addGarment(Garment garment) {
        System.out.println(garment.getName() + " ADDED TO CART");
        order.addGarment(garment);
    }
}
