package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.Pants;

/**
 * Command class used for setting the length of a pair of pants.
 */
public class LengthCommand implements GarmentCustomizationCommand {
    private String descriptor;

    public LengthCommand(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public Garment customize(Garment garment) {
        Pants pants = (Pants) garment;
        pants.setLength(descriptor);
        return pants;
    }
}
