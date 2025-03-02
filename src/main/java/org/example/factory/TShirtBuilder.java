package org.example.factory;

import org.example.products.TShirt;

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
