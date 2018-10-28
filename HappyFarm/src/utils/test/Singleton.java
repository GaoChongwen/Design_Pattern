package utils.test;

import person.Farmer;

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
    }
}
