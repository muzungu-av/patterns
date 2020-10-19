package av.patterns.single;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class Single2Test {
    @Test
    public void getINSTANCE() {
        Single2 o1 = Single2.getINSTANCE();
        Single2 o2 = Single2.getINSTANCE();
        assertSame(o1, o2);
    }
}