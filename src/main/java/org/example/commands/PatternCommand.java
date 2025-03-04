package org.example.commands;

import org.example.products.Garment;
import org.example.products.Skirt;

public class PatternCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        Skirt skirt = (Skirt) garment;
        skirt.setPattern(descriptor);
        return skirt;
    }
}
