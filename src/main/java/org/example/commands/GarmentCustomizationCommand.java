package org.example.commands;

import org.example.business.products.Garment;

/**
 * Abstract parents class for all commands.
 */
public interface GarmentCustomizationCommand {
    Garment customize (Garment garment);
}
