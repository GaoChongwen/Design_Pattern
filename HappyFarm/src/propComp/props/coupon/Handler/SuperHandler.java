package propComp.props.coupon.Handler;

import factory.CouponFactor;
import propComp.props.coupon.CabbageCoupon;
import propComp.props.coupon.SuperCoupon;
import utils.Enum.PlantType;
import utils.Money.Money;

/**
 * @Design-Pattern: Chain of Responsibility Pattern,Static Factory Method,Singleton Pattern
 * @description: SuperHandler类 用于处理生成万能券
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class SuperHandler extends Handler{
    public SuperHandler(){
        super(Handler.SUPER_LEVEL_REQUEST);
    }
    @Override
    protected void response(String plantType) {
        //生成super实例 添加仓库
        SuperCoupon superCoupon = new SuperCoupon();
        System.out.println(superCoupon.getName()+" Added");
        Money.getInstance().couponList.add(superCoupon);
        Money.getInstance().superCouponNum++;
    }
}
