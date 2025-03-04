package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.Pants;

public class FitCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        Pants pants = (Pants) garment;
        pants.setFit(descriptor);
        return pants;
    }
}
