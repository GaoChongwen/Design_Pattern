package test.observer;

import animal.Cow;
import building.shed.ChickShed;
import building.shed.CowShed;
import utils.clock.Clock;

/**
 * @project: HappyFarm
 * @scene: 模拟动物随时间过去而成长
 * @designPattern: Observer
 * @author: Tingjie Wen
 * @date: 2018-10-27
 **/

public class ObserverPatternDemo3 {
    public static void main(String args[]){
        Clock.getInstance().addObserver(CowShed.getInstance());
        for(int i=0; i<10; ++i){
            CowShed.getInstance().addAnimal(new Cow());
        }
        Clock.getInstance().nextRound();
        Clock.getInstance().nextRound();
        CowShed.getInstance().count();
    }
}
