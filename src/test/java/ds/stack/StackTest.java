package ds.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    Stack stack = new Stack(5);
    @Test
    public void peekTest(){
        stack.push(10);
        stack.push(20);
        assertEquals(stack.peek(),20);
    }
    @Test
    public void isEmptyTest(){
        assertTrue(stack.isEmpty());
    }
}
