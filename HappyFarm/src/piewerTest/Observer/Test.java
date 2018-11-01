package piewerTest.Observer;

import animal.Chicken;
import animal.Cow;
import building.shed.ChickShed;
import building.shed.CowShed;
import utils.clock.Clock;

public class Test {
    public static void main(String args[]){
        CowShed cowShed=CowShed.getInstance();
        for(int i=0; i<15; ++i){
            cowShed.addAnimal(new Cow());
        }

        Clock.getInstance().addObserver(cowShed);
        for(int i=0; i<10; ++i){
            Clock.getInstance().nextRound();
            cowShed.count();
        }
    }
}
