package piewerTest.Proxy;

import building.house.airconditioner.AirConditioner;
import building.house.airconditioner.ProxyConditioner;

public class Test {
    public static void main(String[] args) {
        System.out.println("===代理模式=======");
        AirConditioner airConditioner = new ProxyConditioner();
        airConditioner.display();
        System.out.println("==改状态==");
        airConditioner.changeStatus();
        airConditioner.display();
    }
}
