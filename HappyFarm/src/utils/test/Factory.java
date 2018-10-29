package utils.test;

import factory.CouponFactor;
import factory.PlantFactory;
import plant.Apple;
import plant.Wheat;
import propComp.props.coupon.AppleCoupon;
import propComp.props.coupon.Coupon;
import utils.Context;
import utils.Enum.PlantType;
import utils.Money.Money;

public class Factory {
    public static void main(String args[]){
        Wheat w = new Wheat(Context.wheat_stockPrice, Context.wheat_salePrice);
        Apple a = new Apple(Context.apple_stockPrice,Context.apple_salePrice);

        PlantFactory.getInstance().getAllPlant();
        Apple a1 = (Apple)PlantFactory.getInstance().createPlant(PlantType.apple.toString());
        System.out.println("key is"+ a1.getType());

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
