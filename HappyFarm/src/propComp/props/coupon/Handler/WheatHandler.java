package propComp.props.coupon.Handler;

import factory.CouponFactor;
import plant.Wheat;
import propComp.props.coupon.CabbageCoupon;
import propComp.props.coupon.WheatCoupon;
import utils.Enum.PlantType;
import utils.Money.Money;

public class WheatHandler extends Handler {
    public WheatHandler(){
        super(Handler.WHEAT_LEVEL_REQUEST);
    }
    @Override
    protected void response(String plantType) {
        //生成wheat实例 添加仓库
        WheatCoupon wheatCoupon = (WheatCoupon) CouponFactor.getInstance().addCoupon(PlantType.wheat);
        System.out.print(wheatCoupon.getName()+" "+wheatCoupon.getType());
        Money.getInstance().couponList.add(wheatCoupon);
        Money.getInstance().wheatCouponNum++;
    }
}
