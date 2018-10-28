package base;

import utils.MessageBoard;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Chudi LAN
 * Design-Pattern: Singleton, Double Checked Locking, Observer, Mediator
 */
public class Person extends FarmObj implements Observer {
    protected String name;
    protected ArrayList<String> messages;

    protected Person() {
        messages = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    /**
     * Design-Pattern：Observer
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + ": I can see "+((MessageBoard)o).getMessageNum()+" messages.");
    }

    /**
     * Design-Pattern：Mediator
     */
    public void leaveMessage(String message) {
        MessageBoard.addMessage(this, message);
    }
}
