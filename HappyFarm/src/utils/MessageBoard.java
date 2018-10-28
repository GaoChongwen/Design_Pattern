package utils;

import base.Person;

import java.util.*;

/**
 * @author Chudi LAN
 * Design-Pattern£ºSingleton, Double checked Locking, Observer, Mediator
 */
public class MessageBoard extends Observable {

    /**
     * Design-Pattern: Singleton, Double checked locking
     */
    private volatile static MessageBoard ourInstance = new MessageBoard();
    public static MessageBoard getInstance() {
        return ourInstance;
    }
    private MessageBoard() {
    }

    /**
     * Design-Pattern: Mediator
     * @param person
     * @param message
     */
    public static void showMessage(Person person, String message) {
        System.out.println(new Date().toString()
                + " [" + person.getName() +"] : " + message);
    }

    /**
     * Design-Pattern: Observer
     */
    private ArrayList<Observer> employees = new ArrayList();
    public void addObserver(Observer employee) {
        employees.add(employee);
    }
    public void deleteObserver(Observer employee) {
        employees.remove(employee);
    }
    public void notifyObservers() {
        Iterator it = employees.iterator();
        while (it.hasNext()) {
            Observer e = (Observer)it.next();
            e.update(this, null);
        }
    }

    public int getMessageNum(){
        return 0;
    }

}
