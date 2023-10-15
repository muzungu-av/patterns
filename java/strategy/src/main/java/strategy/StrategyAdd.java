package strategy;

import java.util.Optional;

public class StrategyAdd implements IStrategy {
    @Override
    public Optional<Number> execute(long a, long b) {
        return Optional.of(a + b);
    }
}
