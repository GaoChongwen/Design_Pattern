package test.prototype;

import factory.CouponFactor;
import utils.Enum.PlantType;
import utils.Money.Money;

/**
 * @project: HappyFarm
 * @scene: 在商店购买兑换券后，生成兑换券
 * @designPattern: Prototype
 * @author: Jihao Luo
 * @date: 2018-10-30
 **/

public class PrototypeDemo2 {
    public static void main(String args[]){

        System.out.println("==========Prototype_DEMO========");
        System.out.println("Scene: After buying certain coupons in the store, we need to create coupons.\n" +
                "In the program ,ChainOfResponsibility Pattern is used to vertify the kind of the coupon；");
        System.out.println("===================================================");
        System.out.println("=============Then we create the instance===========");
        CouponFactor.getInstance().CouponInitial();//Initial !!!!!!


        CouponFactor.getInstance().add(PlantType.apple.toString());
        System.out.println("Prototype:Coupon:clone:Apple Coupon Created");
        CouponFactor.getInstance().add(PlantType.wheat.toString());
        System.out.println("Prototype:Coupon:clone:Wheat Coupon Created");
        CouponFactor.getInstance().add(PlantType.rice.toString());
        System.out.println("Prototype:Coupon:clone:Rice Coupon Created");
        CouponFactor.getInstance().add(PlantType.cabbage.toString());
        System.out.println("Prototype:Coupon:clone:Cabbage Coupon Created");
        CouponFactor.getInstance().add("super");
        System.out.println("Prototype:Coupon:clone:Super Coupon Created");
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
