package singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Single3Test {
    @Test
    public void getINSTANCE() {
        Single3 o1 = Single3.getINSTANCE();
        Single3 o2 = Single3.getINSTANCE();
        assertEquals(o1, o2);
    }
}