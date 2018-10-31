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

        // 获得全局Clock为Observable
        Clock farmClock = Clock.getInstance();

        // 初始化土地
        ArrayList<FarmLand> lands = new ArrayList<FarmLand> (4);
        lands.add(new CornField());
        lands.add(new RiceField());
        lands.add(new VegtbField());
        lands.add(new AppleField());

        // 初始化农舍
        ArrayList<AnimalHouse> sheds = new ArrayList<>(2);
        sheds.add(CowShed.getInstance());
        sheds.add(ChickShed.getInstance());

        // 测试
        System.out.println("==========ObserverPatternDemo2========");
        System.out.println("Scene: Plants and Animals will grow up everyday.\n"+
                "Sheds and FarmLands are Observer, and Clock is Observable. When Clock changes, Sheds and Farmland will update.");
        System.out.println("=====================================\n");

        // Clock设置DesignPatternMode,输出该模式相关信息
        farmClock.setDesignPattern(DesignPatternMode.ObserverPattern);

        System.out.println("1. Now we add FarmLands and Sheds into ClockObserverList.\n");

        // 将农舍与土地加入Observer列表
        for(FarmLand land:lands){
            farmClock.addObserver(land);
        }
        for(AnimalHouse shed:sheds){
            farmClock.addObserver(shed);
        }

        // 农舍与土地设置DesignPatternMode,输出该模式相关信息
        FarmLand.setDesignPattern(DesignPatternMode.ObserverPattern);
        AnimalHouse.setDesignPattern(DesignPatternMode.ObserverPattern);

        System.out.println("=====\n");
        System.out.println("2. Now we will change the Clock, then it will notify its ClockObserverLiset.\n");

        // 更改时间，通知Observers
        farmClock.nextRound();

        System.out.println("=====\n");
        System.out.println("Test Done.");

    }
}