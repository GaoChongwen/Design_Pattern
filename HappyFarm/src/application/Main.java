package application;

import java.util.Scanner;

/**
 * @author: Chen Yulei
 * @date: 2018-10-31
 **/
public class Main {

    static Scanner scanner = new Scanner(System.in);

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
    }

    private static void showAllAnimals() {
        System.out.println("动物名称\t动物状态");
    }

    private static void showAllPlants() {
        System.out.println("植物名称\t植物状态");
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

    }

    private static void harvsetPlants() {


    }
}
