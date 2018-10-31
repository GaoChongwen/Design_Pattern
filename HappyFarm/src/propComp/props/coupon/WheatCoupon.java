package propComp.props.coupon;

import plant.Wheat;

/**
 * @Design-Pattern: Prototype
 * @description: 小麦兑换券类，继承Coupon
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class WheatCoupon extends Coupon {
    public WheatCoupon(){
        setName("WheatCoupon");
        price = 100;
        setType("Item");
    }

}
