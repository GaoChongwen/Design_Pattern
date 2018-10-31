package utils.clock;

import propComp.PropDir.Root;

import java.util.*;

public class Clock extends Observable {
    private static Clock instance;

    private Clock() {
        curDay = 1;
        timeSpeed = 1;
    }

    private int curDay;
    private int timeSpeed;

    public static Clock getInstance() {
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

    private static ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        //System.out.println("add");
        observers.add(observer);
        System.out.println(observers.size());
    }

    public void deleteObserver(Observer observer) {
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
