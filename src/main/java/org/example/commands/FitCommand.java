package org.example.commands;

import org.example.products.Garment;
import org.example.products.Pants;

public class FitCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        Pants pants = (Pants) garment;
        pants.setFit(descriptor);
        return pants;
    }
}
