package strategy;

import java.util.Optional;

/**
 * паттерн Стратегия
 */
public interface IStrategy {
    Optional<Number> execute(long a, long b);
}
