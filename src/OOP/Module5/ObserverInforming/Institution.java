package OOP.Module5.ObserverInforming;

import java.beans.*;

public class Institution implements PropertyChangeListener {
    private String name;

    public Institution(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(name + " received information from " + evt.getPropertyName() + ":");
        System.out.println(evt.getNewValue());
    }
}