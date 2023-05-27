package oop.hus.lab10.strategy.pseudocode;

public class Context implements Strategy {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    @Override
    public int execute(int a, int b) {
        return strategy.execute(a, b);
    }
}
