package action;

import test.strategy.Strategy;

public class StrategyContext {
    private ActionStrategy strategy;

    public StrategyContext(ActionStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.doAction();
    }
}
