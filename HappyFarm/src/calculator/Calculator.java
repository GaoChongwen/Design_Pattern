package calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
/**
 * @project: calcultor
 * @description: 对表达式进行转换，并提供从左到右的计算
 * @designPatter: InterpreterPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class Calculator{
    private String statement;
    private Node node;

    public void build(String statement){
        Node left=null,right=null;
        Stack stack=new Stack();
        String[] statementA=statement.split(" ");
        ArrayList<String> strings=ReversePN(statementA);
        String[] statementArr=new String[strings.size()];
        for(int i=0;i<strings.size();i++){
            statementArr[i]=strings.get(i);
        }
        for(int i=0;i<statementArr.length;i++){
            if(statementArr[i].equalsIgnoreCase("*")){
                left=(Node)stack.pop();
                right=(Node)stack.pop();
                stack.push(new MulNode(left,right));
            }
            else if(statementArr[i].equalsIgnoreCase("/")){
                right=(Node)stack.pop();
                left=(Node)stack.pop();
                stack.push(new DivNode(left,right));
            }
            else if(statementArr[i].equalsIgnoreCase("+")){
                left=(Node)stack.pop();
                right=(Node)stack.pop();
                stack.push(new AddNode(left,right));
            }
            else if(statementArr[i].equalsIgnoreCase("-")){
                right=(Node)stack.pop();
                left=(Node)stack.pop();
                stack.push(new SubNode(left,right));
            }
            else{
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }
        }
        this.node=(Node)stack.pop();
    }
    public static ArrayList<String> ReversePN(String[] expression){

        ArrayList<String> list = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();
        Map<String, Integer> priority = new HashMap<String, Integer>();
        priority.put("+", 1);
        priority.put("-", 1);
        priority.put("*", 2);
        priority.put("/", 2);
        priority.put("(", 0);

        for (int i = 0; i < expression.length; i++) {
            String read = expression[i];
            if (!" ".equals(read)
                    && ("+".equals(read) || "-".equals(read)
                    || "*".equals(read) || "/".equals(read)
                    || "(".equals(read) || ")".equals(read))) {
                if (stack.empty() || read.equals("(")) {
                    stack.push(read);
                } else if (read.equals(")")) {
                    int j = stack.search("(");
                    for (int j2 = 1; j2 < j; j2++) {
                        list.add(stack.pop());
                    }
                    stack.pop();
                } else if (priority.get(read) > priority.get(stack.peek())) {
                    stack.push(read);
                } else {
                    list.add(stack.pop());
                    stack.push(read);
                }

            } else if (!" ".equals(read)) {
                list.add(read);
            }
        }

        while(!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }



    public int compute(){
        return node.interpret();
    }
}
