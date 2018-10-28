package building.ImpVisitor;

import building.house.House;
import building.shed.Shed;
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
        System.out.print("======春节到了======\n挂灯笼咯~");
    }

    // 春节要帖福字
    public void postFU() {
        System.out.println("帖福字咯~");
    }

    // 春节要帖对联
    public void postCouplet() {

        System.out.println("帖对联咯~");
    }

    @Override
    public void visit(House house) {
        house.showHouse();
        hanglantern();
        postFU();
        postCouplet();
        System.out.println("房子有了春节的气息。\n");
    }

    @Override
    public void visit(Shed shed) {
        System.out.println("春节到了，给" + shed.getName() + "挂上灯笼吧~");
        System.out.println(shed.getName() + "有了春节的气息。\n");
    }
}
