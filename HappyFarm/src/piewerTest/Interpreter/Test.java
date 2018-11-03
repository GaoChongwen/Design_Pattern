package piewerTest.Interpreter;

import calculator.Calculator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

    public static void main(String args[]){
        System.out.println("InterpreterPatterntest ");

        Calculator calculator = new Calculator();


        for(;1==1;) {
            System.out.println("Test calculator");
            System.out.println("[0]calculator [1]Exit ");

            Scanner scanner = new Scanner(System.in);
            String key = scanner.nextLine();
            Pattern pattern = Pattern.compile("[0-1]");
            if (pattern.matcher(key).matches()) {
                switch (key) {
                    case "0":
                        System.out.println("input your Expression(Each character is separated by spaces like: 5 * 6 - 1)");
                        Scanner input=new Scanner(System.in);
                        String statement=input.nextLine();
                        calculator.build(statement);
                        int result = calculator.compute();
                        System.out.println("InterpreterPatter:Calculator:compute:"+statement + " = " + result);
                        break;
                    case "1":
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Error enter");
                }
            }
            else {
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Error! Please type again! ");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("\n");
            }
        }
    }
}
