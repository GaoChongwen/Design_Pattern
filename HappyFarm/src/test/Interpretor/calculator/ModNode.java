package test.Interpretor.calculator;

/**
 * @project: calculator
 * @description: 求模解释器
 * @designPatter: InterpreterPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class ModNode extends SymbolNode{
     public ModNode(Node left,Node right)
     {
        super(left,right);
    }

    public int interpret()
    {
        return super.left.interpret() % super.right.interpret();
    }

}
