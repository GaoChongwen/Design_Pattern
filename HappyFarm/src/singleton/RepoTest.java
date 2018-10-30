package singleton;

import base.plant.Plant;
import plant.Rice;
import plant.Wheat;
import singleton.Repository;

/**
 * @project: HappyFarm
 * @description: 测试仓库：对植物的增删改查
 * @designPattern: null
 * @author: Chen Yulei
 * @date: 2018-10-29
 **/
public class RepoTest {

    public static void main(String[] args) {

        Repository repository = Repository.getInstance();

        // 添加植物
        Plant rice1 = new Rice();
        Plant rice2 = new Rice();
        Plant rice3 = new Rice();
        Plant wheat = new Wheat();
        repository.add(rice1, rice2, rice3, wheat);
        System.out.println("Current repository：");//当前库存z
        System.out.println(repository);

        // 删除植物
        repository.remove(rice1);
        System.out.println("Current repository：");
        System.out.println(repository);

        // 获取所有水稻
        System.out.println(repository.get(rice1.getName()));

    }
}
