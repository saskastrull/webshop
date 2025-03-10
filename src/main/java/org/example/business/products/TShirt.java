package org.example.business.products;

/**
 * Class representing a shirt.
 */
public class TShirt extends Garment {
    private int price = 25;
    private String sleeves;
    private String neck;

    public TShirt() {}

    @Override
    public String toString() {
        return (this.getName() + " " +
                this.getColor().name() + " " +
                this.getMaterial().name() + " " +
                this.getSize().name() + " " +
                this.sleeves + " " +
                this.neck) + " " +
                this.getId();
    }

    @Override
    public int getPrice() { return price; }

    @Override
    public void setPrice(int price) { this.price = price; }

    public String getSleeves() {
        return sleeves;
    }

    public String getNeck() {
        return neck;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
        System.out.println("SLEEVES SET TO " + this.sleeves);
    }

    public void setNeck(String neck) {
        this.neck = neck;
        System.out.println("NECK SET TO " + this.neck);
    }
}
