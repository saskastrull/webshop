package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.TShirt;

public class SleevesCommand implements GarmentCustomizationCommand {
    private String descriptor;

    public SleevesCommand(String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public Garment customize(Garment garment) {
        TShirt tshirt = (TShirt) garment;
        tshirt.setSleeves(descriptor);
        return tshirt;
    }
}
