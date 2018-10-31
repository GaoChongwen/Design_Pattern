package calculator;
/**
 * @project: calculator
 * @description: 加法解释器
 * @designPatter: InterpreterPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class AddNode  extends SymbolNode{
    public AddNode (Node left,Node right)
    {
        super(left,right);
    }

    public int interpret()
    {
        return left.interpret() + right.interpret();
    }
}
