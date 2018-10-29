package building.ImpVisitor;

import building.house.House;
import building.shed.AnimalHouse;

/**
 * @project: HappyFarm
 * @description: 作为设计者模式中的visitor
 * @designPattern: Visitor
 * @author: Chen Yulei
 * @date: 2018-10-28
 **/
public interface BuildingVisitor {

    // 访问接受者的实现类
    public void visit(House house);
    public void visit(AnimalHouse shed);
}
