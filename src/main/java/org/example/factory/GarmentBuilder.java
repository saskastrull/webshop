package org.example.factory;

import org.example.constants.general.*;
import org.example.products.Garment;

public abstract class GarmentBuilder {
    protected Size size;
    protected Material material;
    protected Color color;

    public GarmentBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public GarmentBuilder setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public GarmentBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public abstract Garment build();
}
