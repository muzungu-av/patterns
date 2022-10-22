package observer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubjectImplTest {

    private SubjectImpl subject;
    private ObserverImpl first;
    private ObserverImpl second;
    private ObserverImpl third;

    @Before
    public void init() {
        first = new ObserverImpl("First");
        second = new ObserverImpl("Second");
        third = new ObserverImpl("Third");
        subject = new SubjectImpl();
    }

    @Test
    public void test1() {
        subject.registerObserver(first);
        subject.registerObserver(second);
        subject.registerObserver(third);

        subject.setNewValue(1);
        Assert.assertEquals("(First) Got a new value - 1", first.getMessage());
        Assert.assertEquals("(Second) Got a new value - 1", second.getMessage());
        Assert.assertEquals("(Third) Got a new value - 1", third.getMessage());

        subject.removeObserver(first);

        subject.setNewValue(2);
        Assert.assertEquals("(First) Got a new value - 1", first.getMessage());
        Assert.assertEquals("(Second) Got a new value - 2", second.getMessage());
        Assert.assertEquals("(Third) Got a new value - 2", third.getMessage());

        subject.removeObserver(second);

        subject.setNewValue(3);
        Assert.assertEquals("(First) Got a new value - 1", first.getMessage());
        Assert.assertEquals("(Second) Got a new value - 2", second.getMessage());
        Assert.assertEquals("(Third) Got a new value - 3", third.getMessage());

        subject.removeObserver(third);

        subject.setNewValue(4);
        Assert.assertEquals("(First) Got a new value - 1", first.getMessage());
        Assert.assertEquals("(Second) Got a new value - 2", second.getMessage());
        Assert.assertEquals("(Third) Got a new value - 3", third.getMessage());
    }
}