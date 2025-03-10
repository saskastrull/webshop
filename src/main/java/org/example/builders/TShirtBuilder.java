package org.example.builders;

import org.example.business.products.TShirt;
import org.example.constants.general.*;

/**
 * Builder class for constructing shirts.
 */
public class TShirtBuilder extends GarmentBuilder {
    private TShirt tshirt = new TShirt();

    public TShirtBuilder addId(int id) {
        tshirt.setId(id);
        return this;
    }

    public TShirtBuilder addName(String name) {
        tshirt.setName(name);
        return this;
    }

    public TShirtBuilder addColor(Color color) {
        tshirt.setColor(color);
        return this;
    }

    public TShirtBuilder addSize(Size size) {
        tshirt.setSize(size);
        return this;
    }

    public TShirtBuilder addMaterial(Material material) {
        tshirt.setMaterial(material);
        return this;
    }

    @Override
    public TShirt build() {
        return tshirt;
    }
}
