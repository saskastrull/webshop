package org.example.commands;

import org.example.products.Garment;
import org.example.products.Skirt;

public class WaistlineCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        Skirt skirt = (Skirt) garment;
        skirt.setWaistline(descriptor);
        return skirt;
    }
}
