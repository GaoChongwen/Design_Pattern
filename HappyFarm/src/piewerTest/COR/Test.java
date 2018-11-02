package piewerTest.COR;

import factory.CouponFactor;
import utils.Enum.PlantType;
import utils.Money.Money;

public class Test {
    public static void couponTest(){

        System.out.println("=============Coupon test=====================");
        System.out.println("initialize the coupon factor at first");
        CouponFactor.getInstance().CouponInitial();

        System.out.println("=============Create various coupons==========");
        System.out.println("=============================================");
        System.out.println("=============Apple coupon added.=============");
        CouponFactor.getInstance().add(PlantType.apple.toString());
        System.out.println("=============Wheat coupon added.=============");
        CouponFactor.getInstance().add(PlantType.wheat.toString());
        System.out.println("=============Rice coupon added.==============");
        CouponFactor.getInstance().add(PlantType.rice.toString());
        System.out.println("=============Cabbage coupon add.=============");
        CouponFactor.getInstance().add(PlantType.cabbage.toString());
        System.out.println("=============Super coupon added.=============");
        CouponFactor.getInstance().add("super");

        System.out.println("========Use the coupon created before========");
        System.out.println("========account initialized to 300===========");
        System.out.println("buy 2 apples");
        System.out.println(Money.getInstance().buy("Apple",2,100));
        System.out.println("then 2 wheat");
        System.out.println(Money.getInstance().buy("Wheat",2,100));
        System.out.println("1 more wheat");
        System.out.println(Money.getInstance().buy("Wheat",1,100));
    }

    public static void main(String args[]){
        couponTest();
    }
}
