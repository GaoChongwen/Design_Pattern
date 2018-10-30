package propComp.props.coupon.Handler;

public abstract class Handler {
    public final static String APPLE_LEVEL_REQUEST = "apple";
    public final static String CABBAGE_LEVEL_REQUEST = "cabbage";
    public final static String RICE_LEVEL_REQUEST = "rice";
    public final static String WHEAT_LEVEL_REQUEST = "wheat";
    public final static String SUPER_LEVEL_REQUEST = "super";
    //能处理的级别 当都无法处理的时候生成SUPER万能券
    private String plantType = null;
    private Handler nextHandler;
    public Handler(String plantType){
        this.plantType = plantType;
    }

    public final void HandleMessage(String plantType){
        if (plantType.equals(this.plantType)){
            response(this.plantType);
        }else{
            if (this.nextHandler!=null){
                this.nextHandler.HandleMessage(plantType);
            }else{
                System.out.println("Coupon error");
            }

        }

    }

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;

    }
    protected abstract void response(String plantType);
}
