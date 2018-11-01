package sampleProgram;

import store.Criteria.Criteria;
import test.Iterator.IteratorDemo;
import test.abstractFactory.FactoryDemo1;
import test.adaptor.AdaptorPatternDemo1;
import test.adaptor.AdaptorPatternDemo2;
import test.bridge.Bridge;
import test.builder.Builder;
import test.chainOfResponsibility.COR_Demo1;
import test.command.CommandPatternDemo;
import test.composite.CompositePatternDemo;
import test.compositeEntity.CompositeEntityPatternDemo;
import test.decorator.DecoratorPatternDemo;
import test.facade.FacadePatternDemo;
import test.factoryMethod.*;
import test.filter.CriteriaTest;
import test.flyweight.FlyweightPatternDemo;
import test.interpreter.InterpreterPatterDemo;
import test.mediator.Mediator;
import test.memento.MementoPatternDemo;
import test.nullObject.NullObjectPatternDemo;
import test.observer.Observer;
import test.observer.ObserverPatternDemo2;
import test.observer.ObserverPatternDemo3;
import test.prototype.PrototypeDemo1;
import test.prototype.PrototypeDemo2;
import test.proxy.ProxyDemo;
import test.singleton.Singleton;
import test.singleton.SingletonDemo2;
import test.singleton.SingletonDemo3;
import test.singleton.SingletonDemo4;
import test.specification.Specification;
import test.state.State;
import test.state.StatePatternDemo2;
import test.strategy.Strategy;
import test.templateMethod.TemplateMethod;
import test.visitor.VisitorPatternDemo;

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
        printPatterns();
        System.out.print("\nPlease input the number of design patter you want to see：");

        Scanner scanner = new Scanner(System.in);
        String input = "0";
        if (scanner.hasNext()) {
            input = scanner.next();
        }
        while (!input.equals("0")) {
            switch (input) {
                case "1":
                    FactoryDemo1.main(args);
                    break;
                case "2":
                    Builder.main(args);
                    break;
                case "3":
                    FactoryPatternDemo1.main(args);
                    FactoryPatternDemo2.main(args);
                    FactoryPatternDemo3.main(args);
                    FactoryPatternDemo4.main(args);
                    FactoryPatternDemo5.main(args);
                    break;
                case "4":
                    PrototypeDemo1.main(args);
                    PrototypeDemo2.main(args);
                    break;
                case "5":
                    Singleton.main(args);
                    SingletonDemo2.main(args);
                    SingletonDemo3.main(args);
                    SingletonDemo4.main(args);
                    break;
                case "6":
                    ProxyDemo.main(args);
                    break;
                case "7":
                    FlyweightPatternDemo.main(args);
                    break;
                case "8":
                    DecoratorPatternDemo.main(args);
                    break;
                case "9":
                    CompositePatternDemo.main(args);
                    break;
                case "10":
                    AdaptorPatternDemo1.main(args);
                    AdaptorPatternDemo2.main(args);
                    break;
                case "11":
                    Bridge.main(args);
                    break;
                case "12":
                    CriteriaTest.main(args);
                    break;
                case "13":
                    FacadePatternDemo.main(args);
                    break;
                case "14":
                    Strategy.main(args);
                    break;
                case "15":
                    TemplateMethod.main(args);
                    break;
                case "16":
                    Observer.main(args);
                    ObserverPatternDemo2.main(args);
                    ObserverPatternDemo3.main(args);
                    break;
                case "17":
                    IteratorDemo.main(args);
                    break;
                case "18":
                    COR_Demo1.main(args);
                    break;
                case "19":
                    CommandPatternDemo.main(args);
                    break;
                case "20":
                    MementoPatternDemo.main(args);
                    break;
                case "21":
                    State.main(args);
                    StatePatternDemo2.main(args);
                    break;
                case "22":
                    VisitorPatternDemo.main(args);
                    break;
                case "23":
                    Mediator.main(args);
                    break;
                case "24":
                    InterpreterPatterDemo.main(args);
                    break;
                case "25":
                    NullObjectPatternDemo.main(args);
                    break;
                case "26":
                    CompositeEntityPatternDemo.main(args);
                    break;
                case "27":
                    Specification.main(args);
                    break;
                case "p":
                    printPatterns();
                    break;
                default:
                    System.out.println("Please input the number of design patter you want to see:");
                    break;
            }
            System.out.print("\nPlease input the number of design patter you want to see：");
            if (scanner.hasNext()) {
                input = scanner.next();
            }
        }
    }

    private static void printPatterns() {
        System.out.println("=======================================================================");
        System.out.println("*                   There are 27 design patterns：                    *");
        System.out.println("*                    1. Abstract Factory                              *");
        System.out.println("*                    2. Builder                                       *");
        System.out.println("*                    3. Factory Method                                *");
        System.out.println("*                    4. Prototype                                     *");
        System.out.println("*                    5. Singleton                                     *");
        System.out.println("*                    6. Proxy                                         *");
        System.out.println("*                    7. Flyweight                                     *");
        System.out.println("*                    8. Decorator                                     *");
        System.out.println("*                    9. Composite                                     *");
        System.out.println("*                    10. Adaptor                                      *");
        System.out.println("*                    11. Bridge                                       *");
        System.out.println("*                    12. Filter                                       *");
        System.out.println("*                    13. Facade                                       *");
        System.out.println("*                    14. Strategy                                     *");
        System.out.println("*                    15. Template Method                              *");
        System.out.println("*                    16. Observer                                     *");
        System.out.println("*                    17. Iterator                                     *");
        System.out.println("*                    18. Chain of Responsibility                      *");
        System.out.println("*                    19. Command                                      *");
        System.out.println("*                    20. Memento                                      *");
        System.out.println("*                    21. State                                        *");
        System.out.println("*                    22. Visitor                                      *");
        System.out.println("*                    23. Mediator                                     *");
        System.out.println("*                    24. Interpretor                                  *");
        System.out.println("*                    25. Null Object                                  *");
        System.out.println("*                    26. Composite Entity                             *");
        System.out.println("*                    27. Specification                                *");
        System.out.println("*                    0. Exit                                          *");
        System.out.println("*                    p. print all patterns                            *");
        System.out.println("=======================================================================");
    }
}
