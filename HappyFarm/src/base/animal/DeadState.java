package base.animal;

import com.sun.corba.se.spi.orbutil.fsm.State;

public class DeadState implements AnimalState {
    private Animal animal;
    public DeadState(Animal animal){
        this.animal=animal;
    }
    @Override
    public void grow() {

    }

    @Override
    public void eat() {

    }
}
