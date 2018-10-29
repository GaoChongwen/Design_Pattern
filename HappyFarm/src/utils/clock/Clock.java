package utils.clock;

import base.ClockObserver;

import java.util.*;

public class Clock extends Observable {
    private Clock instance;

    private Clock() {
        curDay = 1;
        timeSpeed = 1;
    }

    private int curDay;
    private int timeSpeed;

    public Clock getInstance() {
        if (instance == null) {
            return new Clock();
        }
        return instance;
    }

    public int getCurDay() {
        return curDay;
    }

    public int getTimeSpeed() {
        return timeSpeed;
    }

    public void nextRound() {
        curDay += timeSpeed;
        notifyObservers();
    }

    private ArrayList<ClockObserver> observers = new ArrayList();

    public void addObserver(ClockObserver observer) {
        observers.add(observer);

    }

    public void deleteObserver(ClockObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this, null);
        }
    }
}
