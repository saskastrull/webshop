package org.example.builders;

import org.example.business.products.TShirt;

public class TShirtBuilder extends GarmentBuilder {

    @Override
    public TShirt build() {
        TShirt tshirt = new TShirt();
        tshirt.setSize(size);
        tshirt.setMaterial(material);
        tshirt.setColor(color);
        return tshirt;
    }
}
