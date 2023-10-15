package singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Single4Test {
    @Test
    public void getINSTANCE() {
        Single4 o1 = Single4.getINSTANCE();
        Single4 o2 = Single4.getINSTANCE();
        assertEquals(o1, o2);
    }
}