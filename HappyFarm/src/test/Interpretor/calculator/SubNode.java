package test.Interpretor.calculator;

/**
 * @project: calculator
 * @description: 减法解释器
 * @designPatter: InterpreterPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class SubNode extends SymbolNode{
    public SubNode (Node left,Node right)
    {
        super(left,right);
    }

    public int interpret()
    {
        return left.interpret() - right.interpret();
    }
}
