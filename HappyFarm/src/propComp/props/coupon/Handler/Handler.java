package propComp.props.coupon.Handler;

/**
 * @Design-Pattern: Chain of Responsibility Pattern
 * @description: Handler类 用处处理选择对应的类生成兑换券
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public abstract class Handler {
    public final static String APPLE_LEVEL_REQUEST = "apple";
    public final static String CABBAGE_LEVEL_REQUEST = "cabbage";
    public final static String RICE_LEVEL_REQUEST = "rice";
    public final static String WHEAT_LEVEL_REQUEST = "wheat";
    public final static String SUPER_LEVEL_REQUEST = "super";
    //能处理的级别 当都无法处理的时候生成SUPER万能券
    private String plantType = null;
    private Handler nextHandler;//设置下一个处理请求的类
    public Handler(String plantType){
        this.plantType = plantType;
    }

    public final void HandleMessage(String plantType){
        if (plantType.equals(this.plantType)){
            response(this.plantType);
            //能够处理的时候 使用当前类的方法处理
        }else{
            if (this.nextHandler!=null){
                this.nextHandler.HandleMessage(plantType);
                //不能处理的时候 移交给下一个处理
            }else{
                System.out.println("Coupon error");
                //当不存在这种类型的券的时候 输出Coupon Error
            }

        }

    }

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;

    }
    protected abstract void response(String plantType);
}
