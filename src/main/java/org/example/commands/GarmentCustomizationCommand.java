package org.example.commands;

import org.example.products.Garment;

public interface GarmentCustomizationCommand {
    Garment customize (Garment garment, String descriptor);
}
