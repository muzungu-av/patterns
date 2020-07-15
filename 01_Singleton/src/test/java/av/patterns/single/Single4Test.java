package av.patterns.single;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Single4Test {

    @Test
    public void getINSTANCE() {
        Object t1 = Single4.getINSTANCE();
        Object t2 = Single4.getINSTANCE();
        assertThat(t1, is(t2));
    }
}