package building.ImpVisitor;

import building.house.House;
import building.shed.AnimalHouse;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @project: HappyFarm
 * @description: 给建筑制造春节的气氛
 * @designPatter: Visitor
 * @author: Chen Yulei
 * @create: 2018-10-28
 **/
public class SpringVisitor implements BuildingVisitor {

    // 春节要挂灯笼
    public void hanglantern(){
        System.out.print("======Spring Festival is coming======\nHanging lantern ~");
    }

    // 春节要帖福字
    public void postFU() {
        System.out.println("Posting FU ~");
    }

    // 春节要帖对联
    public void postCouplet() {

        System.out.println("Posting couplet ~");
    }

    @Override
    public void visit(House house) {
        house.showHouse();
        hanglantern();
        postFU();
        postCouplet();
        System.out.println("The house has the breath of the Spring Festival. \n");
    }

    @Override
    public void visit(AnimalHouse shed) {
        System.out.println("Spring Festival is coming，hanging lantern for " + shed.getName());
        System.out.println(shed.getName() + "has the breath of Spring Festival。\n");
    }
}
