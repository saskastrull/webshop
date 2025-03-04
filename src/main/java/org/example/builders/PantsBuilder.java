package org.example.builders;

import org.example.business.products.Pants;

public class PantsBuilder extends GarmentBuilder {

    @Override
    public Pants build() {
        Pants pants = new Pants();
        pants.setSize(size);
        pants.setMaterial(material);
        pants.setColor(color);
        return pants;
    }
}
