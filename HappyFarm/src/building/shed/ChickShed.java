package building.shed;

import building.ImpVisitor.BuildingVisitor;
/**
 * @project: HappyFarm
 * @description: 动物窝的具体实现类——鸡窝
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class ChickShed extends Shed {

    // 鸡窝的名字（如：鸡窝1号...）
    private String name;

    // 获取鸡窝名字
    public String getName() {
        return name;
    }

    // 设置鸡窝名字
    public void setName(String name) {
        this.name = name;
    }

    public ChickShed(String name) {
        this.name = name;
    }

    // 搭建鸡窝
    @Override
    public void bulidShed() {
        System.out.println("正在为小鸡搭建鸡窝...");
    }

    // 鸡窝搭建完成
    @Override
    public void done() {
        System.out.println("一个简陋的鸡窝搭建完成。\n");
    }

    // 作为Visitor模式中的接受者, 接收访问者
    @Override
    public void accept(BuildingVisitor buildingVisitor) {
//        super.accept(buildingVisitor);
        buildingVisitor.visit(this);
    }
}
