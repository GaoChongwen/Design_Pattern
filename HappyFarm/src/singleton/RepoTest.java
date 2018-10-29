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
        Plant rice1 = new Rice(20,30);
        Plant rice2 = new Rice(21,30);
        Plant rice3 = new Rice(22,30);
        Plant wheat = new Wheat(10,13);
        repository.add(rice1, rice2, rice3, wheat);
        System.out.println("当前仓库库存：");
        System.out.println(repository);

        // 删除植物
        repository.remove(rice1);
        System.out.println("当前仓库库存：");
        System.out.println(repository);

        // 获取所有水稻
        System.out.println(repository.get(rice1.getType()));

    }
}
