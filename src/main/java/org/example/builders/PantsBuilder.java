package org.example.builders;

import org.example.business.products.Pants;
import org.example.constants.general.*;

/**
 * Builder class for constructing pants.
 */
public class PantsBuilder extends GarmentBuilder {
    private Pants pants = new Pants();

    public PantsBuilder addId(int id) {
        pants.setId(id);
        return this;
    }

    public PantsBuilder addName(String name) {
        pants.setName(name);
        return this;
    }

    public PantsBuilder addColor(Color color) {
        pants.setColor(color);
        return this;
    }

    public PantsBuilder addSize(Size size) {
        pants.setSize(size);
        return this;
    }

    public PantsBuilder addMaterial(Material material) {
        pants.setMaterial(material);
        return this;
    }

    @Override
    public Pants build() {
        return pants;
    }
}
