package org.example.business.products;

public class TShirt extends Garment {
    private int price = 25;
    private String sleeves;
    private String neck;

    public TShirt() {}

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
        System.out.println("SLEEVES WERE CUSTOMIZED TO " + this.sleeves);
    }

    public void setNeck(String neck) {
        this.neck = neck;
        System.out.println("NECK WAS CUSTOMIZED TO " + this.neck);
    }
}
