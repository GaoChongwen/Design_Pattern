package base;

import calculator.Calculator;
import singleton.MessageBoard;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Chudi LAN
 * Design-Pattern: Singleton, Double Checked Locking, Observer, Mediator
 */
abstract public class Person extends FarmObj implements Observer {
    protected ArrayList<String> messages;

    protected Person() {
        messages = new ArrayList<>();
    }

    /**
     * Design-Pattern：Observer
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getName() + ": I can see "+((MessageBoard)o).getMessageNum()+" messages.");
    }

    /**
     * Design-Pattern：Mediator
     */
    public void leaveMessage(String message) {

        MessageBoard.addMessage(this, message);
    }

    /**
     * Used in Interpreter
     */
    public String calculate(String expression) {
        Calculator calculator = new Calculator();
        calculator.build(expression);
        return calculator.compute()+"";
    }

}
