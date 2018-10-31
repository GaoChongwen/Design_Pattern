package propComp.props.coupon;

/**
 * @Design-Pattern: Prototype
 * @description: 大米兑换券类，继承Coupon
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class RiceCoupon extends  Coupon {
    public RiceCoupon(){
        setName("RiceCoupon");
        price = 100;
        setType("Item");
    }

}
