package org.example.commands;

import org.example.products.Garment;
import org.example.products.Pants;

public class LengthCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        Pants pants = (Pants) garment;
        pants.setLength(descriptor);
        return pants;
    }
}
