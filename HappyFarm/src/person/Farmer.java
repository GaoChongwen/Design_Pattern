package person;

import base.Person;

/**
 * @author Chudi LAN
 * Design-Pattern：Singleton, Double checked locking
 */
public class Farmer extends Person {
    private volatile static Farmer ourInstance = new Farmer();
    public static Farmer getInstance() { return ourInstance; }
    private Farmer(){ this.name = "Farmer"; }
}
