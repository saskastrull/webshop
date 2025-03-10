package org.example.builders;

import org.example.business.products.Garment;

/**
 * Abstract parent class for all concrete garment builders.
 */
public abstract class GarmentBuilder {
    public abstract Garment build();
}
