package singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Single1Test {
    @Test
    public void test1() {
        Object o1 = Single1.INSTANCE.getObject();
        Object o2 = Single1.INSTANCE.getObject();
        assertEquals(o1, o2);
    }
}