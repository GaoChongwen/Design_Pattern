package building.shed;

public class ChickShed extends Shed {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChickShed(String name) {
        this.name = name;
    }

    @Override
    public void bulidShed() {
        System.out.println("正在为小鸡搭建鸡窝...");
    }

    @Override
    public void done() {
        System.out.println("一个简陋的鸡窝搭建完成。\n");
    }
}
