package building.ImpVisitor;

/**
 * @project: HappyFarm
 * @description: 作为访问者设计模式中的acceptor
 *               接收visitor来操作实现类
 * @designPatter: Visitor
 * @author: Chen Yulei
 * @create: 2018-10-28
 **/
public interface BuildingAcceptor {

    public void accept(BuildingVisitor buildingVisitor);
}
