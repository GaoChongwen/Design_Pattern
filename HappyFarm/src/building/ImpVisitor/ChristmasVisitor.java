package building.ImpVisitor;

import building.house.House;
import building.shed.AnimalHouse;
/**
 * @project: HappyFarm
 * @description: 给建筑制造圣诞节的气氛
 * @designPatter: Visitor
 * @author: Chen Yulei
 * @create: 2018-10-28
 **/
public class ChristmasVisitor implements BuildingVisitor {

    // 摆放圣诞树
    public void placeChristmastree() {
        System.out.println("======Christmas is coming======\nPlacing a Christmas tree ~");
    }

    // 挂上装饰物
    public void hangDecorations() {
        System.out.println("Hanging the Santa decorations ~");
    }

    @Override
    public void visit(House house) {
        house.showHouse();
        placeChristmastree();
        hangDecorations();
        System.out.println(" The house has a breath of Christmas.\n");
    }

    @Override
    public void visit(AnimalHouse shed) {
        System.out.print("Christmas is coming，");
        hangDecorations();
        System.out.println(shed.getName() + "has a breath of Christmas。\n");
    }
}
