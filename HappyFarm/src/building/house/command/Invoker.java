package building.house.command;


/**
 * @project: command
 * @description: command的执行者
 * @designPatter: Command
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class Invoker {
    private ICommand command=null;
    //private List<ICommand> iCommandList=new  ArrayList<ICommand>();

    public void setCommand(ICommand command)
    {
        this.command=command;
        //iCommandList.add(command);
    }
    public void runCommand()
    {
        command.Execute();
        //for(ICommand command:iCommandList){
            //command.Execute();
        //}
        //iCommandList.clear();
    }
}
