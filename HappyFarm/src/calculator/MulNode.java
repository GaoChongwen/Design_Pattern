package calculator;
/**
 * @project: calculator
 * @description: 乘法解释器
 * @designPatter: InterpreterPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/


public class MulNode extends SymbolNode {
    public MulNode (Node left,Node right)
    {
        super(left,right);
    }

    public int interpret()
    {
        return left.interpret() * right.interpret();
    }
}
