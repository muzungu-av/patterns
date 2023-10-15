package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private Integer value;

    private List<Observer> observers;

    public SubjectImpl() {
        this.observers = new ArrayList();
        value = 0;
    }

    @Override
    public void registerObserver(Observer o) {
        if (o != null) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.value);
        }
    }

    public void setNewValue(Integer newValue) {
        value = newValue;
        notifyObservers();
    }
}
