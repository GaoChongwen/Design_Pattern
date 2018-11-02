package propComp.props.coupon.Handler;

import factory.CouponFactor;
import propComp.props.coupon.WheatCoupon;
import utils.Enum.PlantType;
import utils.Money.Money;

/**
 * @Design-Pattern: Chain of Responsibility Pattern,Static Factory Method,Singleton Pattern
 * @description: WheatHandler类 用于处理生成小麦券
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class WheatHandler extends Handler {
    public WheatHandler(){
        super(Handler.WHEAT_LEVEL_REQUEST);
    }
    @Override
    protected void response(String plantType) {
        //生成wheat实例 添加仓库
        WheatCoupon wheatCoupon = (WheatCoupon) CouponFactor.getInstance().addCoupon(PlantType.wheat);
        System.out.println(wheatCoupon.getName()+" Added");
        Money.getInstance().couponList.add(wheatCoupon);
        Money.getInstance().wheatCouponNum++;
    }
}
