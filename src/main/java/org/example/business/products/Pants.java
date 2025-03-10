package org.example.business.products;

/**
 * Class representing a pair of pants.
 */
public class Pants extends Garment {
    private int price = 30;
    private String fit;
    private String length;

    public Pants() {}

    @Override
    public String toString() {
        return (this.getName() + " " +
                this.getColor().name() + " " +
                this.getMaterial().name() + " " +
                this.getSize().name() + " " +
                this.fit + " " +
                this.length) + " " +
                this.getId();
    }

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
        System.out.println("FIT SET TO " + this.fit);
    }

    public void setLength(String length) {
        this.length = length;
        System.out.println("LENGTH SET TO " + this.length);
    }
}
