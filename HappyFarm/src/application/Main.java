package application;

import animal.Cow;
import base.animal.Animal;
import base.plant.Plant;
import building.farmland.FarmLand;
import building.house.House;
import building.house.airconditioner.ProxyConditioner;
import building.shed.*;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import factory.EmployeeFactory;
import factory.PlantFactory;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import person.Employee;
import person.Farmer;
import propComp.PropDir.Prop;
import singleton.Farm;
import singleton.MessageBoard;
import singleton.Repository;
import store.Specification.ISpecification;
import store.Specification.SpecificationShow;
import store.Store;
import test.specification.Specification;
import utils.Money.Money;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SplittableRandom;

/**
 * @author: Chen Yulei
 * @date: 2018-10-31
 **/
public class Main {

    static Scanner scanner = new Scanner(System.in);

    static Farmer farmer = Farmer.getInstance();

    static Repository repository = Repository.getInstance();
    static PlantFactory plantFactory = PlantFactory.getInstance();

    static Farm farm = Farm.getInstance();

    static Store store = Store.getInstance();

    static House house = House.getInstance();

    public static void main(String[] args) {

        // 初始化农场
        farm.initialFarmObj();

        System.out.println("======================================");
        System.out.println("======= Welcome to Happy Farm! =======");
        System.out.println("======================================");
        System.out.println("*          1. 进入种植园              *");
        System.out.println("*          2. 进入牲畜园              *");
        System.out.println("*          3. 进入商店                *");
        System.out.println("*          4. 房屋设置                *");
        System.out.println("*          5. 查看仓库                *");
        System.out.println("*          6. 查看留言板              *");
        System.out.println("*          7. 一天过去了...           *");
        System.out.println("*          0. 退出                   *");
        System.out.println("======================================");
        System.out.println("请选择：");
        String input = "0";
        if (scanner.hasNext()) {
            input = scanner.next();
        }
        while (!input.equals("0")) {
            switch (input) {
                case "1":
                    enterPlants();
                    break;
                case "2":
                    enterAnimals();
                    break;
                case "3":
                    enterShop();
                    break;
                case "4":
                    houseSet();
                    break;
                case "5":
                    watchRepository();
                    break;
                case "6":
                    watchMessageBorad();
                    break;
                case "7":

                    break;
                default:
                    System.out.println("非合法输入，请重新输入：");
                    break;
            }
            System.out.println("======================================");
            System.out.println("*          1. 进入种植园              *");
            System.out.println("*          2. 进入牲畜园              *");
            System.out.println("*          3. 进入商店                *");
            System.out.println("*          4. 房舍设置                *");
            System.out.println("*          5. 查看仓库                *");
            System.out.println("*          6. 查看留言板              *");
            System.out.println("*          7. 一天过去了...           *");
            System.out.println("*          0. 退出                   *");
            System.out.println("======================================");
            if (scanner.hasNext()) {
                input = scanner.next();
            }
        }
        scanner.close();
    }

    private static void houseSet() {
        System.out.println("当前的农夫房屋装修信息为：");
        house.showHouse();
        ProxyConditioner proxyConditioner = new ProxyConditioner();
        System.out.println("当前空调状态：");
        proxyConditioner.display();

        System.out.println("=====================");
        System.out.println("*    1. 重新装修房屋  *");
        System.out.println("*    2. 更改空调状态  *");
        System.out.println("*    0. 返回         *");
        System.out.println("=====================");

        int inputSel;
        while (scanner.hasNextInt()) {
            inputSel = scanner.nextInt();
            if (inputSel == 1) {
                String wall = "";
                String door = "";
                String tile = "";
                String window = "";

                System.out.println("请选择墙体颜色:\t1.Yellow\t2.Gray\t3.White");
                int inputWall;
                while (scanner.hasNextInt()) {
                    inputWall = scanner.nextInt();
                    if (inputWall >= 1 && inputWall <= 3) {
                        switch (inputWall){
                            case 1:wall = "Yellow";break;
                            case 2:wall = "Gray";break;
                            case 3:wall = "White";break;
                        }
                        break;
                    }
                    else {
                        System.out.println("非法输入。请重新选择墙体颜色：");
                    }
                }

                System.out.println("请选择门的材质颜色:\t1.Wooden\t2.Iron");
                int inputDoor;
                while (scanner.hasNextInt()) {
                    inputDoor = scanner.nextInt();
                    if (inputDoor >= 1 && inputDoor <= 3) {
                        switch (inputDoor){
                            case 1:door = "Wooden";break;
                            case 2:door = "Iron";break;
                        }
                        break;
                    }
                    else {
                        System.out.println("非法输入。请重新选择墙体颜色：");
                    }
                }

                System.out.println("请选择瓦片颜色:\t1.Red\t2.Green");
                int inputTile;
                while (scanner.hasNextInt()) {
                    inputTile = scanner.nextInt();
                    if (inputTile >= 1 && inputTile <= 3) {
                        switch (inputTile){
                            case 1:tile = "Red";break;
                            case 2:tile = "Green";break;
                        }
                        break;
                    }
                    else {
                        System.out.println("非法输入。请重新瓦片颜色：");
                    }
                }

                System.out.println("请选择窗户样式:\t1.Pushable\t2.Slidable");
                int inputWin;
                while (scanner.hasNextInt()) {
                    inputWin = scanner.nextInt();
                    if (inputWin >= 1 && inputWin <= 3) {
                        switch (inputWin){
                            case 1:window = "Pushable";break;
                            case 2:window = "Slidable";break;
                        }
                        break;
                    }
                    else {
                        System.out.println("非法输入。请重新窗户样式：");
                    }
                }
                house.setInfo(wall+"Wall", door+"Door", tile+"Tile",window+"Window");
                house.showHouse();
                break;
            }
            else if (inputSel == 2) {
                proxyConditioner.changeStatus();
                proxyConditioner.display();
            }
            else if (inputSel == 0) {
                return;
            }
            else {
                System.out.println("非法输入。请重新输入");
            }
        }

    }

    private static void watchRepository() {
        if (repository.isEmtpy()) {
            System.out.println("当前仓库为空。");
            return;
        }
        repository.printRepoInfo();
//        System.out.println(">>>>" + repository.toString());
        System.out.println("===================");
        System.out.println("*    1. 筛选价格    *");
        System.out.println("*    0. 返回       *");
        System.out.println("===================");
        System.out.println("请选择操作：");
        int inputSel = 0;
        while (scanner.hasNextInt()) {
            inputSel = scanner.nextInt();
            if (inputSel == 1) {
                System.out.print("请输入价格（将筛选出大于此价格的植物）：");
                int inputPrice;
                if (scanner.hasNextInt()) {
                    inputPrice = scanner.nextInt();
                    SpecificationShow specificationShow = SpecificationShow.getInstance();
                    specificationShow.useSpecification(repository.getPlants(), inputPrice);
                    break;
                }
            }
            else if (inputSel == 0){
                return;
            }
            else {
                System.out.println("非法输入。请重新输入：");
            }
        }
    }

    private static void watchMessageBorad() {
        // 进入留言板
        MessageBoard.getInstance().showMessages();
        System.out.println("===================");
        System.out.println("*    1. 留言       *");
        System.out.println("*    2. 计算板     *");
        System.out.println("*    0. 返回       *");
        System.out.println("===================");
        int inputSel = 0;
        while (scanner.hasNextInt()) {
            inputSel = scanner.nextInt();
            if (inputSel == 1) {
                System.out.println("请输入您的留言：");
                String messages;
                if (scanner.hasNext()) {
                    messages = scanner.next();
                    farmer.leaveMessage(messages);
                }
                break;
            }
            else if (inputSel == 2) {
                System.out.println("请输入算式表达式（如：1 + 1）：");
                String expression;
                if (scanner.hasNext()) {
                    expression = scanner.next();
                    farmer.calculate(expression);
                }
                break;
            }else if(inputSel == 0){
                return;
            }
        }
    }

    private static void enterShop() {
        System.out.println("您当前拥有的金钱为" + Money.money);
        store.show();
//        System.out.println("===================");
//        System.out.println("*    1. 买种子     *");
//        System.out.println("*    2. 买幼崽     *");
//        System.out.println("*    3. 买道具     *");
//        System.out.println("*    4. 买雇员     *");
//        System.out.println("*    0. 返回       *");
//        System.out.println("===================");
        System.out.println("请输入您要购买的商品序号（0返回）：");
        int input;
        String goods = "wheat";
        while (scanner.hasNextInt()) {
            input = scanner.nextInt();
            if (input >= 1 && input <= 14) {
                switch (input) {
                    case 1:goods = "wheat";break;
                    case 2:goods = "apple";break;
                    case 3:goods = "cabbage";break;
                    case 4:goods = "rice";break;
                    case 5:goods = "cow";break;
                    case 6:goods = "chicken";break;
                    case 7:goods = "appleField";break;
                    case 8:goods = "vegtbField";break;
                    case 9:goods = "riceField";break;
                    case 10:goods = "cornField";break;
                    case 11:goods = "allField";break;
                    case 12:goods = "firstLi";break;
                    case 13:goods = "secondLi";break;
                    case 14:goods = "thirdLi";break;
                }

                break;
            } else if (input == 0) {
                return;
            }
            else {
                System.out.println("非法输入。请重新输入您要购买的商品序号：");
            }
        }
        System.out.println("请输入您要购买的数量（0返回）：");
        int inputNum;
        while (scanner.hasNextInt()) {
            inputNum = scanner.nextInt();
            if (inputNum >= 1) {
                farmer.buy(goods, inputNum);
                break;
            }
            else if (inputNum == 0) {
                return;
            }
            else {
                System.out.println("非法输入。请重新输入您要购买的数量：");
            }
        }
    }

    private static void enterAnimals() {
        showAllAnimals();
        System.out.println("=====================");
        System.out.println("*    1. 宰杀动物     *");
        System.out.println("*    2. 升级牛棚     *");
        System.out.println("*    3. 升级鸡舍     *");
        System.out.println("*    0. 返回         *");
        System.out.println("=====================");
        System.out.println("请选择操作：");
        int input;
        while (scanner.hasNextInt()) {
            input = scanner.nextInt();
            if (input >= 0 && input <= 3) {
                switch (input) {
                    case 0:
                        return;
                    case 1:
                        killAnimals();
                        break;
                    case 2:
                        CowShed cowShed = CowShed.getInstance();
                        updateShed(cowShed);
                        break;
                    case 3:
                        ChickShed chickShed = ChickShed.getInstance();
                        updateShed(chickShed);
                        break;
                }
                System.out.println("=====================");
                System.out.println("*    1. 宰杀动物     *");
                System.out.println("*    2. 升级牛棚     *");
                System.out.println("*    3. 升级鸡舍     *");
                System.out.println("*    0. 返回         *");
                System.out.println("=====================");
                System.out.println("请选择操作：");
            }
            else {
                System.out.println("非法输入。请重新选择操作：");
            }
        }
    }

    private static void updateShed(AnimalHouse animalHouse) {

        System.out.println("=====================");
        System.out.println("*    1. 加固篱笆     *");
        System.out.println("*    2. 升级照明设备  *");
        System.out.println("*    3. 升级雨棚     *");
        System.out.println("*    0. 返回         *");
        System.out.println("=====================");
        System.out.println("请选择您要执行的操作：");

        int input;
        while (scanner.hasNextInt()) {

            input = scanner.nextInt();

            if (input >= 0 && input <= 3) {
                switch (input) {
                    case 1:
                        // 加固篱笆
                        AnimalHouse fenceShedDecorator = new FenceShedDecorator(animalHouse);
                        fenceShedDecorator.bulidShed();
                        fenceShedDecorator.done();
                        break;
                    case 2:
                        // 升级照明设备
                        AnimalHouse lightShedDecorator = new LightShedDecorator(animalHouse);
                        lightShedDecorator.bulidShed();
                        lightShedDecorator.done();
                        break;
                    case 3:
                        // 升级雨棚
                        AnimalHouse canopyShedDecorator = new CanopyShedDecorator(animalHouse);
                        canopyShedDecorator.bulidShed();
                        canopyShedDecorator.done();
                        break;
                    case 0:return;
                }

                System.out.println("=====================");
                System.out.println("*    1. 加固篱笆     *");
                System.out.println("*    2. 升级照明设备  *");
                System.out.println("*    3. 升级雨棚     *");
                System.out.println("*    0. 返回         *");
                System.out.println("=====================");
                System.out.println("请选择您要执行的操作：");
            }
            else {

                System.out.println("非法输入。请重新选择您要执行的操作：");
            }
        }
    }

    private static void killAnimals() {
        // 选择动物
        AnimalHouse animalHouse = null;
        System.out.print("1.Chicken 2.Cow");
        System.out.print("请选择要宰杀的动物编号：");
        int inputAni = 0;
        if (scanner.hasNextInt()) {
            inputAni = scanner.nextInt();
        }
        if (inputAni == 1) {
            animalHouse = ChickShed.getInstance();
        } else if (inputAni == 2) {
            animalHouse = CowShed.getInstance();
        } else {
            System.out.print("非法输入。");
            return;
        }

        // 选择雇员
        System.out.println("您当前拥有雇员：");
        int employeeNum = showAllEmployee();
        Employee employee = null;
        System.out.println("请选择雇员（输入编号）：");
        int inputEm = 0;
        if (scanner.hasNextInt()) {
            inputEm = scanner.nextInt();
        }
        if (inputEm == 0) {
            return;
        }
        if (inputEm > 0 && inputEm <= employeeNum) {
            employee = farmer.getEmployee(inputEm);
        }
        else {
            System.out.print("非法输入");
            return;
        }

        // 开始宰杀 获得死亡的动物链表
        ArrayList<Animal> deadAinimals = employee.slaughter(animalHouse);
        System.out.println("宰杀了" + deadAinimals.size() + "只");

        if (deadAinimals.size() == 0){
            System.out.println("没有可供宰杀的成熟动物，等耐心等待动物成熟。自动返回到主菜单。");
            return;
        }
        else {
            // 选择去加工的
            int processAnimals = 0;
            System.out.print("请输入要送去加工的数量：");
            while (scanner.hasNextInt()) {
                inputAni = scanner.nextInt();
                if (inputAni > deadAinimals.size()) {
                    System.out.print("超出总数，请重新输入：");
                } else {
                    break;
                }
            }
            for (int i = 0; i < inputAni; i++) {
                farmer.process(deadAinimals.get(deadAinimals.size() - 1));
                deadAinimals.remove(deadAinimals.size() - 1);
            }

            // 杀了的直接卖
            // 加工的放工具包第二天自动卖
            if (deadAinimals.size() != 0) {
                // 卖掉剩下的死亡牲畜，前一个参数是啥
                farmer.sell(deadAinimals.get(0).getType(), deadAinimals.size());
            }
            System.out.println(inputAni + "件加工副产品加工完毕，已放入工具包中。剩下的死亡牲畜已贩卖。您当前拥有的金钱：" + Money.money);
            System.out.println("======宰杀完毕。");
        }
    }

    private static void showAllAnimals() {
        CowShed.getInstance().count();
        ChickShed.getInstance().count();
    }

    private static void showAllPlants() {
        farm.showFarmLand();
    }

    private static void enterPlants() {
        showAllPlants();
        System.out.println("====================");
        System.out.println("*    1. 收割植物    *");
        System.out.println("*    2. 播种植物    *");
        System.out.println("*    0. 返回       *");
        System.out.println("====================");
        String input = "0";
        if (scanner.hasNext()) {
            input = scanner.next();
        }
        while (!input.equals("0")) {
            switch (input) {
                case "1":
                    harvsetPlants();
                    break;
                case "2":
                    sowSeeds();
                    break;
                default:
                    System.out.println("非合法输入，请重新输入：");
                    break;
            }
            System.out.println("====================");
            System.out.println("*    1. 收割植物    *");
            System.out.println("*    2. 播种植物    *");
            System.out.println("*    0. 返回       *");
            System.out.println("====================");
        }
    }

    private static void sowSeeds() {
        // 选择要播种的土地
        System.out.println("请选择你要播种的土地（输入编号）：");
        int inputLand = 0;
        FarmLand farmLand = null;
        if (scanner.hasNextInt()) {
            inputLand = scanner.nextInt();
        }
        if (inputLand >= 1 && inputLand <= 4 ) {
            // 传入编号获取土地
            farmLand = farm.getFarmLand(inputLand);
        }
        else {
            System.out.print("非法输入");
            return;
        }

        System.out.println("当前仓库中的种子有：");
        System.out.println("编号\t种子名称\t种子数量");
        System.out.println("1\twheat\t" + repository.getPlantNum("wheat"));
        System.out.println("2\tapple\t" + repository.getPlantNum("apple"));
        System.out.println("3\trice\t" + repository.getPlantNum("rice"));
        System.out.println("4\tcabbage\t" + repository.getPlantNum("cabbage"));

        // 选择要播种的种子 没有种子则去买
        Plant plant = null;
        System.out.println("请选择你要播种的种子编号（0返回）：");
        int inputSeed = 0;
        while (scanner.hasNextInt()) {
            inputSeed = scanner.nextInt();
            if (inputSeed == 0) {
                return;
            }
            else if (inputSeed == 1) {
                if (repository.getPlantNum("wheat") == 0) {
                    System.out.println("当前wheat种子数为0，是否购买(y/n)?");
                    String inputBuySeed;
                    while (scanner.hasNext()) {
                        inputBuySeed = scanner.next();
                        if (inputBuySeed.equals("y")) {
                            farmer.buy("wheat", 1); // 默认买一枚
                            break;
                        }
                        else if (inputBuySeed.equals("n")) {
                            System.out.println("您选择了不购买种子，无法进行播种，返回主界面。");
                            return;
                        }
                        else {
                            System.out.println("非法输入。是否购买(y/n)?");
                        }
                    }
                }
                plant = plantFactory.createPlant("wheat");
                break;
            }
            else if (inputSeed == 2) {
                if (repository.getPlantNum("apple") == 0) {
                    System.out.println("当前apple种子数为0，是否购买(y/n)?");
                    String inputBuySeed;
                    while (scanner.hasNext()) {
                        inputBuySeed = scanner.next();
                        if (inputBuySeed.equals("y")) {
                            farmer.buy("apple", 1); // 默认买一枚
                            break;
                        } else if (inputBuySeed.equals("n")) {
                            System.out.println("您选择了不购买种子，无法进行播种，返回主界面。");
                            return;
                        } else {
                            System.out.println("非法输入。是否购买(y/n)?");
                        }
                    }
                }
                plant = plantFactory.createPlant("apple");
                break;
            }
            else if (inputSeed == 3) {
                if (repository.getPlantNum("rice") == 0) {
                    System.out.println("当前rice种子数为0，是否购买(y/n)?");
                    String inputBuySeed;
                    while (scanner.hasNext()) {
                        inputBuySeed = scanner.next();
                        if (inputBuySeed.equals("y")) {
                            farmer.buy("rice", 1); // 默认买一枚
                            break;
                        } else if (inputBuySeed.equals("n")) {
                            System.out.println("您选择了不购买种子，无法进行播种，返回主界面。");
                            return;
                        } else {
                            System.out.println("非法输入。是否购买(y/n)?");
                        }
                    }
                }
                plant = plantFactory.createPlant("rice");
                break;
            }
            else if (inputSeed == 4) {
                if (repository.getPlantNum("cabbage") == 0) {
                    System.out.println("当前cabbage种子数为0，是否购买(y/n)?");
                    String inputBuySeed;
                    while (scanner.hasNext()) {
                        inputBuySeed = scanner.next();
                        if (inputBuySeed.equals("y")) {
                            farmer.buy("cabbage", 1); // 默认买一枚
                            break;
                        } else if (inputBuySeed.equals("n")) {
                            System.out.println("您选择了不购买种子，无法进行播种，返回主界面。");
                            return;
                        } else {
                            System.out.println("非法输入。是否购买(y/n)?");
                        }
                    }
                }
                plant = plantFactory.createPlant("cabbage");
                break;
            }
            else {
                System.out.print("非法输入。请重新选择：");
            }
        }

        // 选择要操作的雇员
        System.out.println("您当前拥有雇员：");
        int employeeNum = showAllEmployee();
        System.out.println("请选择雇员（输入编号）：");
        Employee employee;
        int inputEm = 0;
        if (scanner.hasNextInt()) {
            inputEm = scanner.nextInt();
        }
        if (inputEm == 0) {
            return;
        }
        if (inputEm > 0 && inputEm <= employeeNum) {
            employee = farmer.getEmployee(inputEm);
        }
        else {
            System.out.print("非法输入");
            return;
        }

        employee.sowSeed(farmLand, plant);
        System.out.println("播种完毕。");
    }

    private static void harvsetPlants() {

        System.out.println("请选择你要收割的土地（输入编号）：");
        int inputLand = 0;
        FarmLand farmLand = null;
        if (scanner.hasNextInt()) {
            inputLand = scanner.nextInt();
        }
        if (inputLand >= 0 && inputLand <= 3 ) {
            // 传入编号获取土地
            farmLand = farm.getFarmLand(inputLand);
        }
        else {
            System.out.print("非法输入");
            return;
        }

        System.out.println("您当前拥有雇员：");
        // 初始化有一个雇员
        int employeeNum = showAllEmployee();
        System.out.println("请选择雇员（输入编号）：");
        Employee employee;
        int inputEm = 0;
        if (scanner.hasNextInt()) {
            inputEm = scanner.nextInt();
        }
        if (inputEm == 0) {
            return;
        }
        if (inputEm > 0 && inputEm <= employeeNum) {
            employee = farmer.getEmployee(inputEm);
        }
        else {
            System.out.print("非法输入");
            return;
        }

        System.out.println("您当前拥有的工具：");
        // 打印出所有工具
        // 没有工具返回false
        boolean hasTools = farm.showToolInBag();
        // 如果没有工具 询问是否购买
        if (!hasTools) {
            String inputBuy = null;
            System.out.println("是否购买？(y/n)");
            while (scanner.hasNext()) {
                inputBuy = scanner.next();
                if (inputBuy.equals("y") || inputBuy.equals("Y")) {
                    System.out.println("你可以购买的工具有：");
                    System.out.println("1.Sickle\n2.Reaping Machine\n3.WheatReapingMachine");
                    System.out.println("请输入您要购买的工具编号："); // 1 sickle 2 reapingMachine 3 wheatReapingMachine
                    int inputTool = 0;
                    while (scanner.hasNext()) {
                        inputTool = scanner.nextInt();
                        if (inputTool == 1) {
                            farmer.buy("sickle"); // 只买一个
                            break;
                        }
                        else if (inputTool == 2) {
                            farmer.buy("reapingMachine");
                            break;
                        }
                        else if (inputTool == 3) {
                            farmer.buy("wheatReapingMachine");
                            break;
                        }
                        else {
                            System.out.print("非法输入。请重新输入您要购买的工具编号：");
                        }
                    }
                    break;
                } else if (inputBuy.equals("n") || inputBuy.equals("N")) {
                    System.out.println("您选择了不购买工具，自动跳转到主界面。");
                    return;
                } else {
                    System.out.println("非合法输出。是否购买？(y/n)");
                }
            }
            // 购买完后再显示工具
            farm.showToolInBag();
        }
        // 如果有工具 选择工具后开始收割
        else {
            System.out.println("请输入工具编号："); // 1 sickle 2 reapingMachine 3 wheatReapingMachine
            int input = 0;
            String tool = null;
            while (scanner.hasNext()) {
                input = scanner.nextInt();
                if (input == 1) {
                    tool = "sickle";
                    break;
                } else if (input == 2) {
                    tool = "reapingMachine";
                    break;
                } else if (input == 3) {
                    tool = "wheatReapingMachine";
                    break;
                } else {
                    System.out.print("非合法输入。请重新输入工具编号：");
                }
            }
            employee.harvest(farmLand, tool);
        }

        System.out.println("====收割完毕。");
    }

//    private static boolean showAllTools() {

        // 这里用Prop还是prop？？Check好像不是static 问逻辑好
//        boolean exitSickle = prop.Check("sickle");
//        boolean exitWheatReapingMachine = prop.Check("wheatReapingMachine");
//        boolean exitReapingMachine = prop.Check("reapingMachine");
//
//        if (!exitReapingMachine && !exitSickle && !exitWheatReapingMachine) {
//            return false;
//        }
//
//        System.out.print("工具编号：");
//        if (exitSickle) {
//            System.out.print("\t1");
//        }
//        if (exitReapingMachine) {
//            System.out.print("\t2");
//        }
//        if (exitWheatReapingMachine) {
//            System.out.print("\t3\n");
//        }
//        System.out.print("工具名称：");
//        if (exitSickle) {
//            System.out.print("\tSickle");
//        }
//        if (exitReapingMachine) {
//            System.out.print("\tReaping Machine");
//        }
//        if (exitWheatReapingMachine) {
//            System.out.print("\tWheat Reaping Machine\n");
//        }
//        return true;

//    }

    // 返回雇员数量
    private static int showAllEmployee() {
        return EmployeeFactory.getInstance().getAllEmployees();
    }
}
