package propComp.props.coupon.Handler;

import factory.CouponFactor;
import propComp.props.coupon.CabbageCoupon;
import utils.Enum.PlantType;
import utils.Money.Money;

/**
 * @Design-Pattern: Chain of Responsibility Pattern,Static Factory Method,Singleton Pattern
 * @description: CabbageHandler类 用于处理生成白菜券
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class CabbageHandler extends Handler {
    public CabbageHandler(){
        super(Handler.CABBAGE_LEVEL_REQUEST);
    }
    @Override
    protected void response(String plantType) {
        //生成cabbage实例 添加仓库
        CabbageCoupon cabbageCoupon = (CabbageCoupon) CouponFactor.getInstance().addCoupon(PlantType.cabbage);
        System.out.println(cabbageCoupon.getName()+" Added");
        Money.getInstance().couponList.add(cabbageCoupon);
        Money.getInstance().cabbageCouponNum++;
    }
}
