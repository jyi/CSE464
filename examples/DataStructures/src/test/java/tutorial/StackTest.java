package tutorial;

import org.junit.Test;
import org.junit.Assert;

public class StackTest {

    @Test
    public void testPush() {
        Stack<Object> stack = new Stack<Object>();
        stack.push(new Object());
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void testPop() {
        Stack<Object> stack = new Stack<Object>();
        Object o = new Object();
        stack.push(o);
        Object popped = stack.pop();
        Assert.assertEquals(o, popped);
        Assert.assertTrue(stack.isEmpty());
    }
}
