package action;

import base.Action;
import base.Person;

import java.util.ArrayList;

/**
 * 留言板操作
 */
public class MessageBoardAction extends Action {

    /**
     * 被通知的人员列表
     */
    protected ArrayList<Person> people;

    public MessageBoardAction(){
        super();
        people = new ArrayList<>();
    }

    /**
     * 添加人员
     */
    public void addPerson(Person person){
        people.add(person);
    }

    /**
     * 显示留言
     */
    public void showMessage(){

    }


}
