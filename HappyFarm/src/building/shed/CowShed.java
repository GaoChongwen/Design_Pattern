package building.shed;

import building.ImpVisitor.BuildingVisitor;
/**
 * @project: HappyFarm
 * @description: 动物窝的具体实现类——牛棚
 * @designPattern: Decorator
 * @author: Chen Yulei
 * @date: 2018-10-27
 **/
public class CowShed extends AnimalHouse {

    // 牛棚的名称（如：牛棚1号...）
    private String name;

    // 获取牛棚名称
    public String getName() {
        return name;
    }

    // 设置牛棚名称
    public void setName(String name) {
        this.name = name;
    }

    public CowShed(String name) {
        this.name = name;
    }

    // 搭建牛棚
    @Override
    public void bulidShed() {
        System.out.println("正在为奶牛搭建牛棚...");
    }

    // 牛棚搭建完毕
    @Override
    public void done() {
        System.out.println("一个简易的牛棚搭建完成。\n");
    }

    // 作为Visitor模式中的接受者, 接收访问者
    @Override
    public void accept(BuildingVisitor buildingVisitor) {
//        super.accept(buildingVisitor);
        buildingVisitor.visit(this);
    }
}
