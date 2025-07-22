package OOP.Module5.ObserverInforming;

import java.beans.*;

public class Informator {
    private String name;
    private String text;
    private PropertyChangeSupport support;

    public Informator(String name) {
        this.name = name;
        support = new PropertyChangeSupport(this);
    }

    public void addListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    void setText(String text) {
        support.firePropertyChange(name, this.text, text);
        this.text = text;
    }
}