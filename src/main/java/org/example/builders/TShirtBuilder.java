package org.example.builders;

import org.example.business.products.TShirt;
import org.example.constants.general.*;

public class TShirtBuilder extends GarmentBuilder {
    private TShirt tshirt = new TShirt();

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
