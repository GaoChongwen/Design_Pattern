package base;

import utils.MessageBoard;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

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
     * 设计模式：Observer
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + ": I can see "+((MessageBoard)o).getMessageNum()+" messages.");
    }

    /**
     * 设计模式：Mediator
     */
    public void leaveMessage(String message) {

        MessageBoard.showMessage(this, message);
    }
}
