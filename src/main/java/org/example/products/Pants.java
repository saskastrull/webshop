package org.example.products;

import org.example.constants.pants.*;

public class Pants extends Garment {
    private Fit fit;
    private Length length;

    public Pants() {}

    public Fit getFit() {
        return fit;
    }

    public Length getLength() {
        return length;
    }

    public void setFit(Fit fit) {
        this.fit = fit;
    }

    public void setLength(Length length) {
        this.length = length;
    }
}
