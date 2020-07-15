package av.patterns.single;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Single1Test {

    @Test
    public void test1() {
        Object o1 = Single1.INSTANCE.getObject();
        Object o2 = Single1.INSTANCE.getObject();
        assertThat(o1, is(o2));
    }
}