package test.singleton;

import building.house.House;
import singleton.Repository;

/**
 * @project: HappyFarm
 * @description: 测试场景：保证只有一个房子和一个仓库
 * @designPattern: Singleton
 * @author: Chen Yulei
 * @date: 2018-10-31
 **/
public class SingletonDemo2 {

    public static void main(String[] args) {
        System.out.println("Testing Singleton");
        House house1 = House.getInstance();
        House house2 = House.getInstance();

        if(house1 ==  house2) {
            System.out.println("house1 and house2 are the same instance.");
        } else {
            System.out.println("house1 and house2 are not the same instance.");
        }

        Repository repository1 = Repository.getInstance();
        Repository repository2 = Repository.getInstance();
        if(repository1 ==  repository2) {
            System.out.println("repository1 and repository2 are the same instance.");
        } else {
            System.out.println("repository1 and repository2 are not the same instance.");
        }
    }

}
