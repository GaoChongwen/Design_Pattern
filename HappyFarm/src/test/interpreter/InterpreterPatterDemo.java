package test.interpreter;

import calculator.Calculator;

import java.util.Scanner;

/**
 * @project: calculator
 * @description: InterpreterPattern测试
 * @designPatter: InterpreterPattern
 * @author: Chen Zhi
 * @create: 2018-10-28
 **/
public class InterpreterPatterDemo{
    public static void main(String args[]){
        System.out.println("==========InterpreterPatternDemo========");
        System.out.println("Scene: calculator");
        System.out.println("===================================================");
        System.out.println("InterpreterPatter:Calculator:build:input your Expression(Each character is separated by spaces like: 5 * 6 - 1) ");
        Scanner input=new Scanner(System.in);

        String statement=input.nextLine();

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println("InterpreterPatter:Calculator:compute:"+statement + " = " + result);
    }
}
