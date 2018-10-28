package utils.message;

import base.Person;

import java.util.*;

/**
 * 设计模式：Singleton, Observer, Mediator
 */
public class MessageBoard extends Observable {

    /**
     * 设计模式：Singleton, Double checked locking
     */
    private volatile static MessageBoard ourInstance = new MessageBoard();
    public static MessageBoard getInstance() {
        return ourInstance;
    }
    private MessageBoard() {
    }

    /**
     * 设计模式：Mediator
     * @param person
     * @param message
     */
    public static void showMessage(Person person, String message) {
        System.out.println(new Date().toString()
                + " [" + person.getName() +"] : " + message);
    }

    /**
     * 设计模式：Observer
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
