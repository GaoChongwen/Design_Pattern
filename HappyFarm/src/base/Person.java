package base;

import utils.message.LeaveMessage;
import utils.message.Mediator;

import java.util.Observable;
import java.util.Observer;

public class Person extends FarmObj implements Observer, LeaveMessage {
    protected String name;
    private Mediator mediator;

    protected Person() {
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + "sees " + );
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void leaveMessage(String message) {
        mediator.showMessage(this, message);
    }
}
