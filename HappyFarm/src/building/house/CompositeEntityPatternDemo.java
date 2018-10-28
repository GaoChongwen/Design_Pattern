package building.house;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {

        House house = new House();

        // 设置房子信息为"黄墙", "木质门", "红瓦","可推拉窗户"
        house.setInfo("黄墙", "木质门", "红瓦","可推拉窗户");
        house.showHouse();

        // 设置房子信息为"灰墙", "铁门", "绿瓦","滑动窗户"
        house.setInfo("灰墙", "铁门", "绿瓦","滑动窗户");
        house.showHouse();

        // 设置房子信息为"白墙", "铁门", "绿瓦","滑动窗户"
        house.setInfo("白墙", "铁门", "绿瓦","滑动窗户");
        house.showHouse();
    }

}
