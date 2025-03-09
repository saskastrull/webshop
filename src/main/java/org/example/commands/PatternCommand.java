package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.Skirt;

public class PatternCommand implements GarmentCustomizationCommand {
    private String descriptor;

    public PatternCommand(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public Garment customize(Garment garment) {
        Skirt skirt = (Skirt) garment;
        skirt.setPattern(descriptor);
        return skirt;
    }
}
