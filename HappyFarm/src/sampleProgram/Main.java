package sampleProgram;

import test.adaptor.AdaptorPatternDemo1;
import test.adaptor.AdaptorPatternDemo2;
import test.bridge.Bridge;
import test.builder.Builder;
import test.chainOfResponsibility.COR_Demo1;
import test.compositeEntity.CompositeEntityPatternDemo;
import test.decorator.DecoratorPatternDemo;
import test.factoryMethod.FactoryDemo1;
import test.flyweight.FlyweightPatternDemo;
import test.mediator.Mediator;
import test.prototype.PrototypeDemo1;
import test.singleton.Singleton;
import test.singleton.SingletonDemo2;
import test.state.State;
import test.templateMethod.TemplateMethod;
import test.visitor.VisitorPatternDemo;

import java.util.ArrayList;
import java.util.Observer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=======================================================================");
        System.out.println("====================== Welcome to Happy Farm! =========================");
        System.out.println("=======================================================================");
	    System.out.println("* 欢迎来到快乐农场，农场中有五个元素：农场主的房子、种植园、牲畜园、商店和雇员。 *");
        System.out.println("* 种植园：有4块不同种类的土地，分别对应不同种类的植物，种植和收割的工作是雇员的；*");
        System.out.println("* 牲畜园：有1个鸡窝和1个牛棚，鸡窝可以容纳40只鸡，牛棚可以容纳40头牛；         *");
        System.out.println("* 商店：主要出售种子、动物幼崽、道具、雇员；                                *");
        System.out.println("=======================================================================");
        System.out.println("整个项目涉及到28个设计模式：");
	    System.out.println("1. Abstract Factory");
	    System.out.println("2. Builder");
        System.out.println("3. Factory Method");
        System.out.println("4. Prototype");
        System.out.println("5. Singleton");
        System.out.println("6. Proxy");
        System.out.println("7. Flyweight");
        System.out.println("8. Decorator");
        System.out.println("9. Composite");
        System.out.println("10. Adaptor");
        System.out.println("11. Bridge");
        System.out.println("12. Filter");
        System.out.println("13. Facade");
        System.out.println("14. Strategy");
        System.out.println("15. Template Method");
        System.out.println("16. Observer");
        System.out.println("17. Iterator");
        System.out.println("18. Chain of Responsibility");
        System.out.println("19. Command");
        System.out.println("20. Memento");
        System.out.println("21. State");
        System.out.println("22. Visitor");
        System.out.println("23. Mediator");
        System.out.println("24. Interpretor");
        System.out.println("25. Null Object");
        System.out.println("26. Composite Entity");
        System.out.println("27. Specification");
        System.out.println("28. Double Checked Locking");
        System.out.println("0. Exit");
        System.out.println("\n请输入要查看的设计模式的Sample Application的序号：");

        Scanner scanner = new Scanner(System.in);
        String input = "0";
        if (scanner.hasNext()) {
            input = scanner.next();
        }
        while (!input.equals("0")) {
            switch (input) {
                case "1":
//                    AbstractFactoryDemo.main(args);
                    break;
                case "2":
                    Builder.main(args);
                    break;
                case "3":
//                    FactoryDemo1.main(args);
                    break;
                case "4":
                    PrototypeDemo1.main(args);
                    break;
                case "5":
                    Singleton.main(args);
                    SingletonDemo2.main(args);
                    break;
                case "6":
//                    ProxyDemo.main(args);
                    break;
                case "7":
                    FlyweightPatternDemo.main(args);
                    break;
                case "8":
                    DecoratorPatternDemo.main(args);
                    break;
                case "9":
//                    CompositeDemo.main(args);
                    break;
                case "10":
                    AdaptorPatternDemo1.main(args);
                    AdaptorPatternDemo2.main(args);
                    break;
                case "11":
                    Bridge.main(args);
                    break;
                case "12":
//                    FilterDemo.main(args);
                    break;
                case "13":
//                    FactoryDemo.main(args);
                    break;
                case "14":
//                    StrategyDemo.main(args);
                    break;
                case "15":
//                    TemplateMethodDemo.main(args);
                    break;
                case "16":
//                    ObserverDemo.main(args);
                    break;
                case "17":
//                    IteratorDemo.main(args);
                    break;
                case "18":
                    COR_Demo1.main(args);
                    break;
                case "19":
//                    CommandDemo.main(args);
                    break;
                case "20":
//                    MementoDemo.main(args);
                    break;
                case "21":
                    State.main(args);
                    break;
                case "22":
                    VisitorPatternDemo.main(args);
                    break;
                case "23":
                    Mediator.main(args);
                    break;
                case "24":
//                    InterpreterDemo.main(args);
                    break;
                case "25":
//                    NullObjectDemo.main(args);
                    break;
                case "26":
                    CompositeEntityPatternDemo.main(args);
                    break;
                case "27":
//                    SpecificationDemo.main(args);
                    break;
                case "28":
//                    DoubleCheckedLockingDemo.main(args);
                    break;
                default:
                    System.out.println("不合法的输入，请重新输入：");
                    break;
            }
            System.out.println("请输入要查看的设计模式的Sample Application的序号：");
            if (scanner.hasNext()) {
                input = scanner.next();
            }
        }

}
