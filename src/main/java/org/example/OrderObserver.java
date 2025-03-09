package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OrderObserver implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("MAILING CEO" + evt.getPropertyName() + " ... " + evt.getNewValue());
    }
}
