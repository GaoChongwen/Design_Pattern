package singleton;

import base.Person;
import utils.Enum.DesignPatternMode;

import java.util.*;

/**
 * @author Chudi LAN
 * Design-Pattern: Singleton, Double checked Locking, Observer, Mediator
 */
public class MessageBoard extends Observable {
    private static DesignPatternMode designPatternMode = DesignPatternMode.Default;
    /**
     * Design-Pattern: Singleton, Double checked locking
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
     * Design-Pattern: Mediator
     * @param person
     * @param message
     */
    public static void addMessage(Person person, String message) {
        messages.add(new Date().toString()
                + " [" + person.getName() +"] : " + message);
        ourInstance.notifyObservers();
        if(designPatternMode == DesignPatternMode.MediatorPattern) {
            System.out.println("                    [ Mediator Pattern]                      ");
            System.out.println("Person: leaveMessage(): a user is sending message via message board.");
        }
        showMessages();
    }

    public static void showMessages(){
        if(designPatternMode == DesignPatternMode.MediatorPattern)
            System.out.println("Person: showMessage(): Message board show messages as a mediator.");
        System.out.println("-------------------------- Message Bord ------------------------------\n");
        for(String m : messages){
            System.out.println(m);
        }
        System.out.println("\n----------------------------------------------------------------------\n\n");
    }

    /**
     * Design-Pattern: Observer
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

    public static void setDesignPatternMode(DesignPatternMode designPatternMode) {
        MessageBoard.designPatternMode = designPatternMode;
    }
}


