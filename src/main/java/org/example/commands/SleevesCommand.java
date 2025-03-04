package org.example.commands;

import org.example.products.Garment;
import org.example.products.TShirt;

public class SleevesCommand implements GarmentCustomizationCommand {
    @Override
    public Garment customize(Garment garment, String descriptor) {
        TShirt tshirt = (TShirt) garment;
        tshirt.setSleeves(descriptor);
        return tshirt;
    }
}
