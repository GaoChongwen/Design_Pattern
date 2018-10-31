package test.observer;


import building.farmland.*;
import building.shed.AnimalHouse;
import building.shed.ChickShed;
import building.shed.CowShed;
import utils.Enum.DesignPatternMode;
import utils.clock.Clock;

import java.util.ArrayList;

/**
 * @project: HappyFarm
 * @scene: 每过一天，农场中的动物和植物都会生长。农场中的Shed和FarmLand作为观察者，
 * 观察时间的流逝，时间每增长一天，Shed和FarmLand更新，并使农场中的动植物生长一次。
 * @designPattern: Adaptor
 * @author: Lipeng Liang
 * @date: 2018-10-31
 **/

public class ObserverPatternDemo2 {
    public static void main(String args[]) {

        Clock farmClock = Clock.getInstance();

        ArrayList<FarmLand> lands = new ArrayList<FarmLand> (4);
        ArrayList<AnimalHouse> sheds = new ArrayList<>(2);



        lands.add(new CornField());
        lands.add(new RiceField());
        lands.add(new VegtbField());
        lands.add(new AppleField());

        sheds.add(CowShed.getInstance());
        sheds.add(ChickShed.getInstance());

        // 测试
        System.out.println("==========AdaptorPatternDemo1========");
        System.out.println("Scene: FarmLand is an AppleField, which can plant Apple only, so it can't plant Wheat),\n"+
                "Now We use CornAdaptor, which makes AppleField able to plant Wheat (also can plant Apple). It will be invalid after using once.");
        System.out.println("=====================================\n");

        // 设置DesignPatternMode,输出该模式相关信息
        farmClock.setDesignPattern(DesignPatternMode.ObserverPattern);

        for(FarmLand land:lands){
            farmClock.addObserver(land);
        }
        for(AnimalHouse shed:sheds){
            farmClock.addObserver(shed);
        }
        FarmLand.setDesignPattern(DesignPatternMode.ObserverPattern);
        AnimalHouse.setDesignPattern(DesignPatternMode.ObserverPattern);
        farmClock.nextRound();


    }
}