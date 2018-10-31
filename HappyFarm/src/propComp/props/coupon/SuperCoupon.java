package propComp.props.coupon;

/**
 * @Design-Pattern: Prototype
 * @description: 万能兑换券类，继承Coupon
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class SuperCoupon extends Coupon {
    public SuperCoupon(){
        setName("SuperCoupon");
        price = 100;
        setType("Item");
    }

}
