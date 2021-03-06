package action;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Strategy
 */
public interface ActionStrategy {
    boolean execute(boolean success);
    boolean doAction();
}
