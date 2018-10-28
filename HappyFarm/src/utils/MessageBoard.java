package utils;

import base.Person;

import java.util.*;

/**
 * @author Chudi LAN
 * Design-Pattern: Singleton, Double checked Locking, Observer, Mediator
 */
public class MessageBoard extends Observable {

    /**
     * Design-Pattern£ºSingleton, Double checked locking
     */
    private volatile static MessageBoard ourInstance = new MessageBoard();
    public static MessageBoard getInstance() {
        return ourInstance;
    }
    private MessageBoard() {
        messages = new ArrayList<>();
    }
    private static ArrayList<String> messages;

    /**
     * Design-Pattern£ºMediator
     * @param person
     * @param message
     */
    public static void addMessage(Person person, String message) {
        messages.add(new Date().toString()
                + " [" + person.getName() +"] : " + message);
        ourInstance.notifyObservers();
        showMessages();
    }

    public static void showMessages(){
        System.out.println("--------------- Message Bord ---------------");
        for(String m : messages){
            System.out.println(m);
        }
        System.out.println();
    }

    /**
     * Design-Pattern£ºObserver
     */
    private ArrayList<Observer> users = new ArrayList();
    public void addObserver(Person person) {

        users.add(person);
        System.out.println(person.getName() + " is registered to Message Board");
    }
    public void deleteObserver(Observer person) {
        users.remove(person);
    }
    public void notifyObservers() {
        Iterator it = users.iterator();
        while (it.hasNext()) {
            Observer e = (Observer)it.next();
            e.update(this, null);
        }
    }

    public int getMessageNum(){
        return messages.size();
    }

}


