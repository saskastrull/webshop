package org.example.builders;

import org.example.products.Skirt;

public class SkirtBuilder extends GarmentBuilder {

    @Override
    public Skirt build() {
        Skirt skirt = new Skirt();
        skirt.setSize(size);
        skirt.setMaterial(material);
        skirt.setColor(color);
        return skirt;
    }
}
