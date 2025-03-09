package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.Skirt;

public class WaistlineCommand implements GarmentCustomizationCommand {
    private String descriptor;

    public WaistlineCommand(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public Garment customize(Garment garment) {
        Skirt skirt = (Skirt) garment;
        skirt.setWaistline(descriptor);
        return skirt;
    }
}
