package OOP.Module5.ObserverInforming;

import java.beans.*;

public class Institution implements PropertyChangeListener {
    private final String name;

    public Institution(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        MessageInfo messageInfo = (MessageInfo) evt.getNewValue();
        System.out.println(name + " received information from " + messageInfo.getSender() + ":");
        System.out.println(messageInfo.getMessage());
    }
}