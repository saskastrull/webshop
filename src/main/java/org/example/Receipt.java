package org.example;

public class Receipt {
    private Order order;

    public Receipt() {}

    public Receipt(Order order) {
        this.order = order;
    }

    public void createReceipt() {
        // loopa igenom alla plagg i Order och printa all info om dem
        // skapa textfil för skojs skull? :3
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
