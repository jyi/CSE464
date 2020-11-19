package patterns.observer.example2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer o) {
        observers.add(o);
    }
}
