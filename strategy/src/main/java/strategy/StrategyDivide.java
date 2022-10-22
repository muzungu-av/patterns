package strategy;

import java.util.Optional;

public class StrategyDivide implements IStrategy {

    private Number result;

    @Override
    public Optional<Number> execute(long a, long b) {
        try {
             result = a / b;
        } catch (ArithmeticException ignored) {
            return Optional.empty();
        }
        return Optional.of(result);
    }
}