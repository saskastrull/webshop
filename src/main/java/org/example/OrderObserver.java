package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.example.business.CEO;

/**
 * Observer class used for mailing the CEO.
 */
public class OrderObserver implements PropertyChangeListener {
    private final CEO ceo;

    public OrderObserver(CEO ceo) {
        this.ceo = ceo;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("order")) {
            ceo.receiveMail("NEW GARMENT PRODUCED");
        }
    }
}
