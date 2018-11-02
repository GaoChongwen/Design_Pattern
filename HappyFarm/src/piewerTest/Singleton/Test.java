package piewerTest.Singleton;

import animal.Cow;
import building.house.House;
import building.shed.AnimalHouse;
import building.shed.ChickShed;
import building.shed.CowShed;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import propComp.props.coupon.Coupon;
import singleton.Repository;

public class Test {
    /*
    测试房子、鸡舍、牛棚和仓库单例
     */
    public static void main(String[] args) {
        System.out.println("=== Testing Singleton ===");

        /*
        房子
         */
        House house1 = House.getInstance();
        House house2 = House.getInstance();
        if (house1 == house2) {
            System.out.println("house1 and house2 are the same instance.");
        } else {
            System.out.println("house1 and house2 are not the same instance.");
        }
        System.out.println();

        /*
        仓库
         */
        Repository repository1 = Repository.getInstance();
        Repository repository2 = Repository.getInstance();
        if (repository1 == repository2) {
            System.out.println("repository1 and repository2 are the same instance.");
        } else {
            System.out.println("repository1 and repository2 are not the same instance.");
        }
        System.out.println();

        /*
        鸡舍
         */
        ChickShed chickShed1 = ChickShed.getInstance();
        ChickShed chickShed2 = ChickShed.getInstance();
        if (chickShed1 == chickShed2) {
            System.out.println("chickShed1 and chickShed2 are the same instance.");
        }
        else {
            System.out.println("chickShed1 and chickShed2 are not the same instance.");
        }
        System.out.println();

        /*
        牛棚
         */
        CowShed cowShed1 = CowShed.getInstance();
        CowShed cowShed2 = CowShed.getInstance();
        if (cowShed1 == cowShed2) {
            System.out.println("cowShed1 and cowShed2 are the same instance.");
        }
        else {
            System.out.println("cowShed1 and cowShed2 are not the same instance.");
        }
        System.out.println();
    }
}
