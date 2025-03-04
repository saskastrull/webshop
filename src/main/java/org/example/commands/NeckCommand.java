package org.example.commands;

import org.example.products.Garment;
import org.example.products.TShirt;

public class NeckCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        TShirt tshirt = (TShirt) garment;
        tshirt.setNeck(descriptor);
        return tshirt;
    }
}
