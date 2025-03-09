package org.example.business.products;

import org.example.constants.general.*;

/**
 * Parent class for all concrete garments.
 */
public abstract class Garment {
    private Size size;
    private Material material;
    private Color color;
    private String name;
    private int id;

    protected Garment() {}

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
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

    /**
     * Abstract getter for encouraging all child classes to add a price field.
     * @return price of this garment
     */
    public abstract int getPrice();

    /**
     * Abstract setter for encouraging all child classes to add a price field.
     * @param price of this garment
     */
    public abstract void setPrice(int price);
}
