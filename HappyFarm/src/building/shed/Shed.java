package building.shed;
/**
 * @project: HappyFarm
 * @description: 动物窝的抽象类
 * @designPattern: Decorator, Visitor
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
import base.Building;
import building.ImpVisitor.BuildingAcceptor;
import building.ImpVisitor.BuildingVisitor;

public class Shed extends Building implements BuildingAcceptor {

    // 获取动物窝的名字
    public String getName() {
        return null;
    }

    // 搭建动物窝
    public void bulidShed() {
        System.out.println("开始搭建动物的住所...");
    }

    // 动物窝搭建完成
    public void done() {
        System.out.println("一个简陋的动物屋搭建完成。");
    }

    // 作为Visitor模式中的接受者, 接收访问者
    @Override
    public void accept(BuildingVisitor buildingVisitor) {
        buildingVisitor.visit(this);
    }
}
