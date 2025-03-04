package org.example;

public class Receipt {
    private Order order;
    private String name;
    private int id;

    public Receipt() {}

    public Receipt(Order order) {
        this.order = order;
    }

    public void createReceipt() {
        System.out.println("RECEIPT " + this.id);
        System.out.println("ORDER " + this.order.getId());
        // loopa igenom alla plagg i Order och printa all info om dem, en rad för ett plagg
        System.out.println("HÄR ÄR KVITTOINFO");
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
