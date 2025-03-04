package org.example.commands;

import org.example.products.Garment;
import java.util.ArrayList;

public class GarmentCustomizationPipeline {
    private ArrayList<GarmentCustomizationCommand> pipeline = new ArrayList<>();

    public void addCommand(GarmentCustomizationCommand command) {
        pipeline.add(command);
    }

    public Garment execute(Garment garment, String descriptor) {
        Garment result = garment;

        for(GarmentCustomizationCommand command : pipeline) {
            result = command.customize(result, descriptor);
        }

        return result;
    }
}
