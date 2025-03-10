package org.example.builders;

import org.example.business.products.Skirt;
import org.example.constants.general.*;

/**
 * Builder class for constructing skirts.
 */
public class SkirtBuilder extends GarmentBuilder {
    private Skirt skirt = new Skirt();

    public SkirtBuilder addId(int id) {
        skirt.setId(id);
        return this;
    }

    public SkirtBuilder addName(String name) {
        skirt.setName(name);
        return this;
    }

    public SkirtBuilder addColor(Color color) {
        skirt.setColor(color);
        return this;
    }

    public SkirtBuilder addSize(Size size) {
        skirt.setSize(size);
        return this;
    }

    public SkirtBuilder addMaterial(Material material) {
        skirt.setMaterial(material);
        return this;
    }

    @Override
    public Skirt build() {
        return skirt;
    }
}
