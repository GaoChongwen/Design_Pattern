package piewerTest.State;

import animal.Cow;
import building.shed.CowShed;
import utils.clock.Clock;

public class Test {
    public static void main(String args[]){
        System.out.println("==========StateTest========");
        System.out.println("=====================================\n");

        CowShed cowShed=CowShed.getInstance();
        for(int i=0; i<10; ++i){
            cowShed.addAnimal(new Cow());
        }

        Clock.getInstance().addObserver(cowShed);
        //nextRound和feed分别调用 Animal的grow和eat导致状态间的切换
        Clock.getInstance().nextRound();
        CowShed.getInstance().feed();

        //输出信息
        CowShed.getInstance().count();
    }
}
