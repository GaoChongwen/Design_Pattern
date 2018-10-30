package utils;

public class Context {
    private volatile static Context singleton = new Context();

    private Context() {
        // initial price of plants
        this.apple_stockPrice = 40;
        this.apple_salePrice = 350;
        this.cabbage_stockPrice = 10;
        this.cabbage_salePrice = 100;
        this.rice_stockPrice = 30;
        this.rice_salePrice = 230;
        this.wheat_stockPrice = 20;
        this.wheat_salePrice = 170;

        //initial price of animals
        this.chicken_stockPrice=0;
        this.chicken_salePrice=0;
        this.cow_stockPrice=0;
        this.cow_salePrice=0;
        this.pig_stockPrice=0;
        this.pig_salePrice=0;
    }

    // price of plants
    public static int apple_stockPrice;
    public static int apple_salePrice;
    public static int cabbage_stockPrice;
    public static int cabbage_salePrice;
    public static int rice_stockPrice;
    public static int rice_salePrice;
    public static int wheat_stockPrice;
    public static int wheat_salePrice;

    //price of animals
    public static int chicken_stockPrice;
    public static int chicken_salePrice;
    public static int cow_stockPrice;
    public static int cow_salePrice;
    public static int pig_stockPrice;
    public static int pig_salePrice;

    public static Context getInstance() {
        return singleton;
    }

}
