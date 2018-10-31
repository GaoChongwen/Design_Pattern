package action;

/**
 * @author Chudi LAN
 * @version 2018-10-29
 * Design-Pattern: Strategy
 */
public interface ActionStrategy {
    void execute(boolean success);
    void doAction();
}
