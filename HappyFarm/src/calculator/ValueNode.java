package calculator;

/**
 * @project: calculator
 * @description: 终结符Object 即数字
 * @designPatter: InterpreterPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/

public class ValueNode implements Node
{
    private int value;

    public ValueNode(int value)
    {
        this.value=value;
    }

    public int interpret()
    {
        return this.value;
    }
}
