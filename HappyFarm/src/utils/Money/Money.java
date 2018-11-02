package utils.Money;

import base.Item;

import java.util.ArrayList;

public class Money {
    private static Money instance = new Money();

    public static int money=300;
    public static ArrayList couponList = new ArrayList();
    public static int appleCouponNum = 0;
    public static int cabbageCouponNum = 0;
    public static int riceCouponNum = 0;
    public static int superCouponNum = 0;
    public static int wheatCouponNum = 0;


    //让构造函数为 private，这样该类就不会被实例化
    private Money(){}

    //获取唯一可用的对象
    public static Money getInstance(){
        return instance;
    }

    public boolean sell(int price){
        money += price;
        return true;
    }

    public int calculate(int couponNum,int count,int price){
        if (couponNum>=count) {
            couponNum-=count;
            return couponNum;
        }
        if (couponNum+superCouponNum>=count){
            couponNum=0;
            superCouponNum = superCouponNum-(count-couponNum);
            return couponNum;
        }
        if (couponNum+superCouponNum<count){
            count = count-(couponNum+superCouponNum);
            if (count*price>money){
                return couponNum;
            }else {
                couponNum=0;
                superCouponNum=0;
                money -= count*price;
                return couponNum;
            }
        }
        return couponNum;
    }


    public boolean buy(String item, int count,int price){
        int temp;
        switch (item){
            case "apple":
                temp = appleCouponNum;
                appleCouponNum = calculate(appleCouponNum,count,price);
                return (!(temp==appleCouponNum));
            case "wheat":
                temp = wheatCouponNum;
                wheatCouponNum = calculate(wheatCouponNum,count,price);
                return (!(temp==wheatCouponNum));
            case "rice":
                temp = riceCouponNum;
                riceCouponNum = calculate(riceCouponNum,count,price);
                return (!(temp==riceCouponNum));
            case "cabbage":
                temp = cabbageCouponNum;
                cabbageCouponNum = calculate(cabbageCouponNum,count,price);
                return (!(temp==cabbageCouponNum));
            default:
                if (money-count*price>=0){
                    money -= count*price;
                    return true;
                }else return false;
        }
    }
    public void displayAllCoupon(){
        System.out.println("AppleCoupon:   "+appleCouponNum);
        System.out.println("WheatCoupon:   "+wheatCouponNum);
        System.out.println("RiceCoupon:    "+riceCouponNum);
        System.out.println("CabbageCoupon: "+cabbageCouponNum);
        System.out.println("SuperCoupon:   "+superCouponNum);

    }
}
