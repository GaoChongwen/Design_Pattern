package utils;

public class Context {
    private volatile static Context singleton = new Context();

    private Context() {

    }

    // price of plants
    public static int apple_stockPrice = 40;
    public static int apple_salePrice = 4000;
    public static int cabbage_stockPrice = 10;
    public static int cabbage_salePrice = 1000;
    public static int rice_stockPrice = 30;
    public static int rice_salePrice = 3000;
    public static int wheat_stockPrice = 20;
    public static int wheat_salePrice = 2000;

    // price of animals
    public static int chicken_stockPrice = 50;
    public static int chicken_salePrice = 6000;
    public static int cow_stockPrice = 100;
    public static int cow_salePrice = 10000;
    public static int pig_stockPrice = 70;
    public static int pig_salePrice = 7000;

    // price of produce
    public static int milk_price = cow_salePrice * 2;
    public static int cookedFood_price = pig_salePrice * 2;
    public static int animalFood_price = rice_salePrice * 2;


    // types of tiles
    public static String[] tiles_color = {"red", "blue", "yellow"};
    public static String[] tiles_pattern = {"stripe", "flower"};

    // info of house
    public static String[] wallInfo = {"Red Wall", "Blue Wall", "Yellow Wall"};
    public static String[] doorInfo = {"Wood Door", "Iron Door", "Gold Door"};
    public static String[] windowInfo = {"Landing Windows", "Sliding Windows"};
    public static String[] tileInfo = {"Red Tile", "Blue Tile", "Yellow Tile"};

    public static Context getInstance() {
        return singleton;
    }

}
