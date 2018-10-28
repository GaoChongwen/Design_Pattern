package utils.message;

import base.Person;

import java.util.*;

public class MessageBoard extends Observable implements Mediator {
    private static MessageBoard ourInstance = new MessageBoard();

    public static MessageBoard getInstance() {
        return ourInstance;
    }

    private MessageBoard() {
    }

    @Override
    public void showMessage(Person person, String message) {
        System.out.println(new Date().toString()
                + " [" + person.getName() +"] : " + message);
    }

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

    }

}
