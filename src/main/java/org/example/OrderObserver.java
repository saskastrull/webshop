package org.example;

import org.example.business.CEO;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OrderObserver implements PropertyChangeListener {
    private CEO ceo;
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }

    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }
}
