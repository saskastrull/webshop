package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.TShirt;

public class NeckCommand implements GarmentCustomizationCommand {
    private String descriptor;

    public NeckCommand(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public Garment customize(Garment garment) {
        TShirt tshirt = (TShirt) garment;
        tshirt.setNeck(descriptor);
        return tshirt;
    }
}
