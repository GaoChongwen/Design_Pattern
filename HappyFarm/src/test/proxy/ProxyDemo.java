package test.proxy;

import building.house.airconditioner.AirConditioner;
import building.house.airconditioner.ProxyConditioner;
import building.house.airconditioner.RealConditioner;


/**
 * @project: HappyFarm
 * @scene: 房间里开关空调
 * @designPattern: Proxy
 * @author: Jihao Luo
 * @date: 2018-10-30
 **/
public class ProxyDemo {
    public static void main(String[] args) {
        System.out.println("==========Proxy_DEMO========");
        System.out.println("Scene: In the house we can turn on/off the airconditioner.");
        System.out.println("===================================================");
        AirConditioner airConditioner = new ProxyConditioner();
        System.out.println("=============The airconditioner's initial state===========");
        airConditioner.display();
        System.out.println("=============Then we change it===========");
        airConditioner.changeStatus();
        airConditioner.display();
    }

}
