package utils;

public class Context {
    private volatile static Context singleton = new Context();

    private Context() {
        // initial price of plants
        this.apple_stockPrice = 50;
        this.apple_salePrice = 350;
        this.cabbage_stockPrice = 10;
        this.cabbage_salePrice = 100;
        this.rice_stockPrice = 40;
        this.rice_salePrice = 240;
        this.wheat_stockPrice = 25;
        this.wheat_salePrice = 170;

        // initial price of farmLand
        this.appleField_price = 2000;
        this.cornField_price = 600;
        this.riceField_price = 1300;
        this.vegtbField_price = 100;
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

    // price of farmLand
    public static int appleField_price;
    public static int cornField_price;
    public static int riceField_price;
    public static int vegtbField_price;

    public static Context getInstance() {
        return singleton;
    }

}
