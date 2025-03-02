package org.example.products;

import org.example.constants.general.*;

public abstract class Garment {
    private Size size;
    private Material material;
    private Color color;

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
}
