package person;

import base.Person;
import utils.MessageBoard;

import java.util.Observable;
import java.util.Observer;



public class Employee extends Person implements Observer{

    @Override
    public void update(Observable o, Object arg) {

    }

}
