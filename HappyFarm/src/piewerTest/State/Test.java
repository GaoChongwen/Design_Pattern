package piewerTest.State;

import animal.Cow;
import building.shed.CowShed;
import utils.clock.Clock;

public class Test {
    public static void main(String args[]){
        CowShed cowShed=CowShed.getInstance();
        for(int i=0; i<10; ++i){
            cowShed.addAnimal(new Cow());
        }

        Clock.getInstance().addObserver(cowShed);

        Clock.getInstance().nextRound();
        CowShed.getInstance().feed();

        CowShed.getInstance().count();
    }
}
