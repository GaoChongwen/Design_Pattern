package propComp.props.coupon;

import plant.Cabbage;

/**
 * @Design-Pattern: Prototype
 * @description: 白菜兑换券类，继承Coupon
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class CabbageCoupon extends Coupon {
    public CabbageCoupon(){
        setName("CabbageCoupon");
        price = 100;
        setType("Item");
    }
}
