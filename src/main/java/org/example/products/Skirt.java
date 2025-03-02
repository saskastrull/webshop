package org.example.products;

import org.example.constants.skirt.*;

public class Skirt extends Garment {
    private Waistline waistline;
    private Pattern pattern;

    public Skirt() {}

    public Waistline getWaistline() { return waistline; }

    public Pattern getPattern() { return pattern; }

    public void setWaistline(Waistline waistline) { this.waistline = waistline; }

    public void setPattern(Pattern pattern) { this.pattern = pattern; }
}
