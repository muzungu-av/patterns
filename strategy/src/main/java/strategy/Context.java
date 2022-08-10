package strategy;

import java.util.Optional;

public class Context {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Optional<Number> executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
