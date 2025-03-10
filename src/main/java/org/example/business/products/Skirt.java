package org.example.business.products;

/**
 * Class representing a skirt.
 */
public class Skirt extends Garment {
    private int price = 20;
    private String waistline;
    private String pattern;

    public Skirt() {}

    @Override
    public String toString() {
        return (this.getName() + " " +
                this.getColor().name() + " " +
                this.getMaterial().name() + " " +
                this.getSize().name() + " " +
                this.pattern + " " +
                this.waistline) + " " +
                this.getId();
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public void setPrice(int price) { this.price = price; }

    public String getWaistline() { return waistline; }

    public String getPattern() { return pattern; }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
        System.out.println("WAISTLINE SET TO " + this.waistline);
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
        System.out.println("PATTERN SET TO " + this.pattern);
    }
}
