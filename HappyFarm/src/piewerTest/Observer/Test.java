package piewerTest.Observer;

import animal.Chicken;
import animal.Cow;
import building.shed.ChickShed;
import building.shed.CowShed;
import utils.clock.Clock;

public class Test {
    public static void main(String args[]){

        System.out.println("==========ObserverTest========");
        System.out.println("=====================================\n");
        CowShed cowShed=CowShed.getInstance();
        for(int i=0; i<15; ++i){
            cowShed.addAnimal(new Cow());
        }
        //observer为被观察者
        //将shed加入clock的观察者对垒
        Clock.getInstance().addObserver(cowShed);
        for(int i=0; i<10; ++i){
            //nextRound调用notify
            //shed调用update
            Clock.getInstance().nextRound();
            cowShed.count();
        }

        System.out.println("=====\n");
        System.out.println("Test Done.");
    }
}
