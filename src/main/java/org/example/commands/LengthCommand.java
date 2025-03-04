package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.Pants;

public class LengthCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        Pants pants = (Pants) garment;
        pants.setLength(descriptor);
        return pants;
    }
}
