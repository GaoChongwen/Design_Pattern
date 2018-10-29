package propComp.props.coupon.Handler;

import factory.CouponFactor;
import plant.Cabbage;
import propComp.props.coupon.CabbageCoupon;
import utils.Enum.PlantType;
import utils.Money.Money;

public class CabbageHandler extends Handler {
    public CabbageHandler(){
        super(Handler.CABBAGE_LEVEL_REQUEST);
    }
    @Override
    protected void response(String plantType) {
        //生成cabbage实例 添加仓库
        CabbageCoupon cabbageCoupon = (CabbageCoupon) CouponFactor.getInstance().addCoupon(PlantType.cabbage);
        System.out.print(cabbageCoupon.getName()+" "+cabbageCoupon.getType());
        Money.getInstance().couponList.add(cabbageCoupon);
        Money.getInstance().cabbageCouponNum++;
    }
}
