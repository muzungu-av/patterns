package av.patterns.single;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Single3Test {

    @Test
    public void getINSTANCE() {
        Single3 t1 = Single3.getINSTANCE();
        Single3 t2 = Single3.getINSTANCE();
        assertThat(t1, is(t2));
    }
}