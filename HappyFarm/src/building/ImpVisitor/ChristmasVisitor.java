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
        System.out.println("======圣诞节到了======\n摆一颗圣诞树吧~");
    }

    // 挂上装饰物
    public void hangDecorations() {
        System.out.println("挂上好看的圣诞老人装饰物~");
    }

    @Override
    public void visit(House house) {
        house.showHouse();
        placeChristmastree();
        hangDecorations();
        System.out.println("房子有了圣诞节的气息。\n");
    }

    @Override
    public void visit(AnimalHouse shed) {
        System.out.print("圣诞节到了，给" + shed.getName());
        hangDecorations();
        System.out.println(shed.getName() + "有了圣诞节的气息。\n");
    }
}
