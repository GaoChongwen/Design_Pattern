package action.toolAction;

import base.plant.Plant;

/**
 *
 */
public class ReapingMachineAction extends ToolAction implements HarvestAPI {
    static volatile private ReapingMachineAction instance = new ReapingMachineAction();
    public static ReapingMachineAction getInstance() {return instance;}
    private ReapingMachineAction(){}
    public ReapingMachineAction(Plant plant){
        setTarget(plant);
    }

    @Override
    public void harvest(Plant plant) {
        super.harvest(plant);
    }

    @Override
    public void harvestWheat() {
        System.out.println("harvesting wheat with reaping machine.");
        // todo: 处理速度
    }
}
