package strategy;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class StrategyTest {

    Context context;
    IStrategy add;
    IStrategy sub;
    IStrategy multy;
    IStrategy div;

    @Before
    public void prepare() {
        context = new Context();
        add = new StrategyAdd();
        sub = new StrategySubtract();
        multy = new StrategyMultiply();
        div = new StrategyDivide();
    }

    @Test
    public void simpleAddTest() {
        context.setStrategy(add);
        Optional<Number> result = context.executeStrategy(1, 5);
        assertEquals(6L, result.isPresent() ? result.get().longValue() : Long.MIN_VALUE);
    }

    @Test
    public void simpleSubTest() {
        context.setStrategy(sub);
        Optional<Number> result = context.executeStrategy(1, 5);
        assertEquals(-4L, result.isPresent() ? result.get().longValue() : Long.MIN_VALUE);
    }

    @Test
    public void simpleMultTest() {
        context.setStrategy(multy);
        Optional<Number> result = context.executeStrategy(11, 5);
        assertEquals(55L, result.isPresent() ? result.get().longValue() : Long.MIN_VALUE);
    }

    @Test
    public void simpleDivTest() {
        context.setStrategy(div);
        Optional<Number> result = context.executeStrategy(10, 5);
        assertEquals(2L, result.isPresent() ? result.get().longValue() : Long.MIN_VALUE);
    }

    @Test
    public void complexTest() {
        context.setStrategy(sub);
        context.setStrategy(div);
        context.setStrategy(multy);
        context.setStrategy(add);
        Optional<Number> result = context.executeStrategy(10, 5);
        assertEquals(15L, result.isPresent() ? result.get().longValue() : Long.MIN_VALUE);
    }
}