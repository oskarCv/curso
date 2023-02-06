package ds.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    Stack stack = new Stack(5);
    @Test
    public void pushTest(){
        stack.push(20);
        assertEquals(stack.peek(), 20);
    }
    @Test
    public void popTest(){
        stack.push(40);
        assertEquals(stack.pop(),40);
    }
    @Test
    public void isEmptyTest(){
        assertTrue(stack.isEmpty());
    }
}
