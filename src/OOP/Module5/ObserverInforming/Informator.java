package OOP.Module5.ObserverInforming;

import java.util.ArrayList;
import java.util.List;

public class Informator {
    private String name;
    private List<Institution> listeners = new ArrayList<>();

    public Informator(String name) {
        this.name = name;
    }

    public void addListener(Institution listener) {
        listeners.add(listener);
    }

    public void removeListener(Institution listener) {
        listeners.remove(listener);
    }

    public void setText(String text) {
        for (Institution listener : listeners) {
            listener.receiveMessage(name, text);
        }
    }
}