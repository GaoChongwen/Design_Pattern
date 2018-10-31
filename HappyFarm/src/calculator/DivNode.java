package calculator;

/**
 * @project: calculator
 * @description: 除法解释器
 * @designPatter: InterpreterPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class DivNode extends SymbolNode{
    public DivNode(Node left,Node right){
        super(left,right);
    }

    public int interpret(){
        return super.left.interpret() / super.right.interpret();
    }
}
