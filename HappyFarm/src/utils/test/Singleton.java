package utils.test;

import person.Farmer;
import singleton.MessageBoard;

/**
 * @author Chudi LAN
 * scenario: validate the singleton classes
 */
public class Singleton {
    public static void main(String[] args) {
        System.out.println("Testing Singleton");
        Farmer farmer1 = Farmer.getInstance();
        Farmer farmer2 = Farmer.getInstance();
        if(farmer1 ==  farmer2) {
            System.out.println("farmer1 and farmer2 are the same instance.");
        } else {
            System.out.println("farmer1 and farmer2 are not the same instance.");
        }

        MessageBoard messageBoard1 = MessageBoard.getInstance();
        MessageBoard messageBoard2 = MessageBoard.getInstance();
        if(messageBoard1 ==  messageBoard2) {
            System.out.println("messageBoard1 and messageBoard2 are the same instance.");
        } else {
            System.out.println("messageBoard1 and messageBoard2 are not the same instance.");
        }
    }
}
