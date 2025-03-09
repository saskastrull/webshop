package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.Pants;

public class FitCommand implements GarmentCustomizationCommand {
    private String descriptor;

    public FitCommand(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public Garment customize(Garment garment) {
        Pants pants = (Pants) garment;
        pants.setFit(descriptor);
        return pants;
    }
}
