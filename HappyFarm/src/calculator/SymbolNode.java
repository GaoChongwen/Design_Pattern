package calculator;

/**
 * @project: calculator
 * @description: 非终结符，即操作符+ - * //
 * @designPatter: InterpreterPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class SymbolNode implements Node
{
    protected Node left;
    protected Node right;

    public SymbolNode(Node left,Node right)
    {
        this.left=left;
        this.right=right;
    }
    public int interpret()
    {
        return left.interpret()+right.interpret();
    }
}
