package test.prototype;

import factory.CouponFactor;
import utils.Enum.PlantType;
import utils.Money.Money;

public class PrototypeDemo1 {
    public static void main(String args[]){

        CouponFactor.getInstance().CouponInitial();
        CouponFactor.getInstance().add(PlantType.apple.toString());
        CouponFactor.getInstance().add(PlantType.wheat.toString());
        CouponFactor.getInstance().add(PlantType.rice.toString());
        CouponFactor.getInstance().add(PlantType.cabbage.toString());
        CouponFactor.getInstance().add("super");
        System.out.println(Money.getInstance().couponList.size());
        System.out.println(Money.getInstance().buy("Apple",2,100));
        System.out.println(Money.getInstance().buy("Wheat",2,100));
        System.out.println(Money.getInstance().buy("Wheat",1,100));

        //System.out.println(Money.getInstance().couponList.size());

    }
}