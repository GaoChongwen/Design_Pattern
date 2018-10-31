package application;

import animal.Cow;
import base.animal.Animal;
import base.plant.Plant;
import building.farmland.FarmLand;
import building.shed.AnimalHouse;
import building.shed.ChickShed;
import building.shed.CowShed;
import factory.EmployeeFactory;
import factory.PlantFactory;
import person.Employee;
import person.Farmer;
import propComp.PropDir.Prop;
import singleton.Farm;
import singleton.Repository;

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

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("======= Welcome to Happy Farm! =======");
        System.out.println("======================================");
        System.out.println("*          1. 进入种植园              *");
        System.out.println("*          2. 进入牲畜园              *");
        System.out.println("*          3. 进入商店                *");
        System.out.println("*          4. 查看仓库                *");
        System.out.println("*          5. 查看留言板              *");
        System.out.println("*          6. 一天过去了...           *");
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
                    break;
                case "5":
                    break;
                case "6":
                    break;
                default:
                    System.out.println("非合法输入，请重新输入：");
                    break;
            }
            System.out.println("======================================");
            System.out.println("*          1. 进入种植园              *");
            System.out.println("*          2. 进入牲畜园              *");
            System.out.println("*          3. 进入商店                *");
            System.out.println("*          4. 查看仓库                *");
            System.out.println("*          5. 查看留言板              *");
            System.out.println("*          6. 一天过去了...           *");
            System.out.println("*          0. 退出                   *");
            System.out.println("======================================");
            if (scanner.hasNext()) {
                input = scanner.next();
            }
        }
        scanner.close();
    }

    private static void enterShop() {
        System.out.println("===================");
        System.out.println("*    1. 买种子     *");
        System.out.println("*    2. 买幼崽     *");
        System.out.println("*    3. 买道具     *");
        System.out.println("*    4. 买雇员     *");
        System.out.println("*    0. 返回       *");
        System.out.println("===================");
        String input = "0";
        if (scanner.hasNext()) {
            input = scanner.next();
        }
        while (!input.equals("0")) {
            switch (input) {
                case "1":
                    buySeed();
                    break;
                case "2":
                    break;
                default:
                    System.out.println("非合法输入，请重新输入：");
                    break;
            }
            System.out.println("===================");
            System.out.println("*    1. 买种子     *");
            System.out.println("*    2. 买幼崽     *");
            System.out.println("*    3. 买道具     *");
            System.out.println("*    4. 买雇员     *");
            System.out.println("*    0. 返回       *");
            System.out.println("===================");
        }
    }

    private static void buySeed() {
    }

    private static void enterAnimals() {
        showAllAnimals();
        System.out.println("=====================");
        System.out.println("*    1. 宰杀动物     *");
        System.out.println("*    2. 收农副产品   *");
        System.out.println("*    0. 返回        *");
        System.out.println("====================");
        String input = "0";
        if (scanner.hasNext()) {
            input = scanner.next();
        }
        while (!input.equals("0")) {
            switch (input) {
                case "1":
                    killAnimals();
                    break;
                case "2":
                    break;
                default:
                    System.out.println("非合法输入，请重新输入：");
                    break;
            }
            System.out.println("=====================");
            System.out.println("*    1. 宰杀动物     *");
            System.out.println("*    2. 收农副产品   *");
            System.out.println("*    0. 返回        *");
            System.out.println("====================");
        }
    }

    private static void killAnimals() {
        // 选择动物
        AnimalHouse animalHouse = null;
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
        System.out.println("请选择雇员（输入编号）：");
        int inputEm = 0;
        if (scanner.hasNextInt()) {
            inputEm = scanner.nextInt();
        }
        if (inputEm == 0) {
            return;
        }
        if (inputEm > 0 && inputEm <= employeeNum) {
            Employee employee = farmer.getEmployee(inputEm);
        }
        else {
            System.out.print("非法输入");
            return;
        }

        employee.killAnimals(animalHouse);
        System.out.println("宰杀完毕。");
    }

    private static void showAllAnimals() {
        CowShed cowShed = CowShed.getInstance();
        ChickShed chickShed = ChickShed.getInstance();
        System.out.println("\t动物名称\t数量");
        System.out.println("1\t" + chickShed.getName() + "\t" + chickShed.getChickCount());
        System.out.println("2\t" + cowShed.getName() + "\t" + cowShed.getCowCount());
    }

    private static void showAllPlants() {
        System.out.println("\t土地1号\t土地2号\t土地3号\t土地4号");
        System.out.println("植物种类");
        System.out.println("植物状态");
        // 鹏负责
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
        System.out.println("请选择你要播种的土地（输入编号）：");
        int inputLand = 0;
        FarmLand farmLand = null;
        if (scanner.hasNextInt()) {
            inputLand = scanner.nextInt();
        }
        if (inputLand >= 0 && inputLand <= 3 ) {
            // 传入编号获取土地
//            farmLand =
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

        Plant plant = null;
        System.out.println("请选择你要播种的种子编号：");
        int inputSeed = 0;
        if (scanner.hasNextInt()) {
            inputSeed = scanner.nextInt();
        }
        if (inputSeed == 0) {
            return;
        }
        switch (inputSeed) {
            case 1:plant = plantFactory.createPlant("wheat");break;
            case 2:plant = plantFactory.createPlant("apple");break;
            case 3:plant = plantFactory.createPlant("rice");break;
            case 4:plant = plantFactory.createPlant("cabbage");break;
            default:System.out.println("非法输入");return;
        }

        System.out.println("您当前拥有雇员：");
        int employeeNum = showAllEmployee();
        System.out.println("请选择雇员（输入编号）：");
        int inputEm = 0;
        if (scanner.hasNextInt()) {
            inputEm = scanner.nextInt();
        }
        if (inputEm == 0) {
            return;
        }
        if (inputEm > 0 && inputEm <= employeeNum) {
            Employee employee = farmer.getEmployee(inputEm);
        }
        else {
            System.out.print("非法输入");
            return;
        }

        employee.sowSeeds(farmLand, plant);
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
//            farmLand =
        }
        else {
            System.out.print("非法输入");
            return;
        }

        System.out.println("您当前拥有雇员：");
        int employeeNum = showAllEmployee();
        System.out.println("请选择雇员（输入编号）：");
        int inputEm = 0;
        if (scanner.hasNextInt()) {
            inputEm = scanner.nextInt();
        }
        if (inputEm == 0) {
            return;
        }
        if (inputEm > 0 && inputEm <= employeeNum) {
            Employee employee = farmer.getEmployee(inputEm);
        }
        else {
            System.out.print("非法输入");
            return;
        }

        System.out.println("您当前拥有的工具：");
        showAllTools();
        System.out.println("请输入工具编号："); // 1 sickle 2 reapingMachine 3 wheatReapingMachine
        String input = "0";
        if (scanner.hasNext()) {
            input = scanner.next();
        }
        if (input.equals("0")) {
            return;
        }
        String tool;
        switch (input) {
            case "1":
                tool = "sickle";
                break;
            case "2":
                tool = "reapingMachine";
                break;
            case "3":
                tool = "wheatReapingMachine";
                break;
                default:
                    System.out.print("非合法输入。");
                    return;
        }

        employee.harvest(farmLand, tool);
        System.out.println("收割完毕。");
    }

    private static void showAllTools() {

        // 这里用Prop还是prop？？Check好像不是static 问逻辑好
        Prop prop = new Prop();
        boolean exitSickle = prop.Check("sickle");
        boolean exitWheatReapingMachine = prop.Check("wheatReapingMachine");
        boolean exitReapingMachine = prop.Check("reapingMachine");

        System.out.print("工具编号：");
        if (exitSickle) {
            System.out.print("\t1");
        }
        if (exitReapingMachine) {
            System.out.print("\t2");
        }
        if (exitWheatReapingMachine) {
            System.out.print("\t3\n");
        }
        System.out.print("工具名称：");
        if (exitSickle) {
            System.out.print("\tSickle");
        }
        if (exitReapingMachine) {
            System.out.print("\tReaping Machine");
        }
        if (exitWheatReapingMachine) {
            System.out.print("\tWheat Reaping Machine\n");
        }
    }

    // 返回雇员数量
    private static int showAllEmployee() {
//        return EmployeeFactory.getInstance().getAllEmployees();
    }
}
