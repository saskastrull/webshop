package org.example.products;

import org.example.constants.skirt.*;

public class Skirt extends Garment {
    private int price = 20;
    private Waistline waistline;
    private Pattern pattern;

    public Skirt() {}

    @Override
    public int getPrice() { return price; }

    @Override
    public void setPrice(int price) { this.price = price; }

    public Waistline getWaistline() { return waistline; }

    public Pattern getPattern() { return pattern; }

    public void setWaistline(Waistline waistline) { this.waistline = waistline; }

    public void setPattern(Pattern pattern) { this.pattern = pattern; }
}
