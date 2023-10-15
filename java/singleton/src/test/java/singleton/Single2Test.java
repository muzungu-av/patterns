package singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Single2Test {
    @Test
    public void getINSTANCE() {
        Single2 o1 = Single2.getINSTANCE();
        Single2 o2 = Single2.getINSTANCE();
        assertEquals(o1, o2);
    }
}