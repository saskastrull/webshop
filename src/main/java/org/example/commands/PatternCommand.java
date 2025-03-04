package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.Skirt;

public class PatternCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        Skirt skirt = (Skirt) garment;
        skirt.setPattern(descriptor);
        return skirt;
    }
}
