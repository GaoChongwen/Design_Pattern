package test.chainOfResponsibility;

import factory.CouponFactor;
import utils.Enum.PlantType;
import utils.Money.Money;

/**
 * @project: HappyFarm
 * @scene: 在商店购买兑换券后，生成兑换券
 * 在本设计中,ChainOfResponsibility用于判断生成的兑换券种类
 * @designPattern: ChainOfResponsibility
 * @author: Jihao Luo
 * @date: 2018-10-30
 **/

public class COR_Demo1 {
    public static void main(String args[]){

        System.out.println("==========COR_DEMO1========");
        System.out.println("Scene: After buying certain coupons in the store, we need to create coupons.\n" +
                "In the program ,ChainOfResponsibility Pattern is used to vertify the kind of the coupon；");
        System.out.println("===================================================");
        System.out.println("=============Then we create the instance===========");
        CouponFactor.getInstance().CouponInitial();//Initial !!!!!!
        CouponFactor.getInstance().add(PlantType.apple.toString());
        CouponFactor.getInstance().add(PlantType.wheat.toString());
        CouponFactor.getInstance().add(PlantType.rice.toString());
        CouponFactor.getInstance().add(PlantType.cabbage.toString());
        CouponFactor.getInstance().add("super");
        System.out.println("==========Now we try to use certain coupons========");
        System.out.println("==========In this demo we have money 200===========");
        //System.out.println(Money.getInstance().couponList.size());
        System.out.println("=========And the coupons you created above=========");
        System.out.println("=========if true , we buy items successfully=======");
        System.out.println("=2 apples=");
        System.out.println(Money.getInstance().buy("Apple",2,100));
        System.out.println("=then 2 wheat=");
        System.out.println(Money.getInstance().buy("Wheat",2,100));
        System.out.println("=1 more wheat=");
        System.out.println(Money.getInstance().buy("Wheat",1,100));

        //System.out.println(Money.getInstance().couponList.size());

    }
}