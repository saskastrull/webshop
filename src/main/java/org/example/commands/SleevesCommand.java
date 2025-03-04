package org.example.commands;

import org.example.business.products.Garment;
import org.example.business.products.TShirt;

public class SleevesCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        TShirt tshirt = (TShirt) garment;
        tshirt.setSleeves(descriptor);
        return tshirt;
    }
}
