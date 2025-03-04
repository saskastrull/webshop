package org.example.business.products;

public class Pants extends Garment {
    private int price = 30;
    private String fit;
    private String length;

    public Pants() {}

    @Override
    public int getPrice() { return price; }

    @Override
    public void setPrice(int price) { this.price = price; }

    public String getFit() {
        return fit;
    }

    public String getLength() {
        return length;
    }

    public void setFit(String fit) {
        this.fit = fit;
        System.out.println("FIT WAS CUSTOMIZED TO " + this.fit);
    }

    public void setLength(String length) {
        this.length = length;
        System.out.println("LENGTH WAS CUSTOMIZED TO " + this.length);
    }
}
