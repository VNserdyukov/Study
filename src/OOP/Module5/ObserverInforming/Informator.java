package OOP.Module5.ObserverInforming;

import java.beans.*;

public class Informator {
    private final String name;
    private final PropertyChangeSupport support;
    private String lastMessage;

    public Informator(String name) {
        this.name = name;
        this.support = new PropertyChangeSupport(this);
        this.lastMessage = null;
    }

    public void addListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void setText(String text) {
        MessageInfo messageInfo = new MessageInfo(name, text);
        support.firePropertyChange("message", lastMessage, messageInfo);
        lastMessage = text;
    }
}