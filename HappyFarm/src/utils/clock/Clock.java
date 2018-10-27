package utils.clock;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Clock implements Observable {
    private Clock instance;
    private Clock(){
        curDay=1;
        timeSpeed=1;
    }
    private int curDay;
    private int timeSpeed;

    public Clock getInstance() {
        if(instance==null){
            return new Clock();
        }
        return instance;
    }

    public int getCurDay() {
        return curDay;
    }

    public int getTimeSpeed() {
        return timeSpeed;
    }

    public void nextRound(){
        curDay+=timeSpeed;
    }

    @Override
    public void addListener(InvalidationListener listener) {

    }

    @Override
    public void removeListener(InvalidationListener listener) {

    }
}
