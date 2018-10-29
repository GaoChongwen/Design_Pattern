package action.toolAction;

import base.plant.Plant;

/**
 * @author Chudi LAN
 * @version 2018-10-28
 */
public class SickleAction extends  ToolAction{
    static volatile private SickleAction instance = new SickleAction();
    public static SickleAction getInstance() {return instance;}
    private SickleAction(){}
    public SickleAction(Plant plant){
        setTarget(plant);
    }

    @Override
    public void harvest(Plant plant) {
        super.harvest(plant);
    }

    @Override
    public void harvestWheat() {
        System.out.println("harvesting wheat with sickle.");
        // todo: 处理速度
    }
}
