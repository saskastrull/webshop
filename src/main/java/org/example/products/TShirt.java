package org.example.products;

import org.example.constants.tshirt.*;

public class TShirt extends Garment {
    private Sleeves sleeves;
    private Neck neck;

    public TShirt() {}

    public Sleeves getSleeves() {
        return sleeves;
    }

    public Neck getNeck() {
        return neck;
    }

    public void setSleeves(Sleeves sleeves) {
        this.sleeves = sleeves;
    }

    public void setNeck(Neck neck) {
        this.neck = neck;
    }
}
