package utils.clock;

import utils.Enum.DesignPatternMode;

import java.util.*;

public class Clock extends Observable {
    private static Clock instance;
    private static DesignPatternMode designPattern = null;

    private Clock() {
        curDay = 1;
        timeSpeed = 1;
        designPattern=null;
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

    private ArrayList<Observer> observers = new ArrayList();

    public void addObserver(Observer observer) {
        if(designPattern==DesignPatternMode.ObserverPattern){
            System.out.println("Observer Pattern | Clock method: addObserver(Observer observer) -> "+observer.getClass()+" add to ClockObserverList");
        }
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        if(designPattern==DesignPatternMode.ObserverPattern){
            System.out.println("Observer Pattern | Clock method: notifyObservers() -> notify the ClockObserverList");
        }
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this, null);
        }
    }
    public void setDesignPattern(DesignPatternMode designPatter){
        designPattern=designPatter;
    }

}
