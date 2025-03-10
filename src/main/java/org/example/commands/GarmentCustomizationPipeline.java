package org.example.commands;

import org.example.business.products.Garment;
import java.util.ArrayList;

/**
 * Pipeline class for storing commands.
 */
public class GarmentCustomizationPipeline {
    private ArrayList<GarmentCustomizationCommand> pipeline = new ArrayList<>();

    public void addCommand(GarmentCustomizationCommand command) {
        pipeline.add(command);
    }

    public Garment execute(Garment garment) {
        Garment result = garment;

        for(GarmentCustomizationCommand command : pipeline) {
            result = command.customize(result);
        }
        return result;
    }
}
