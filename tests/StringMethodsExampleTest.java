import org.junit.Test;

import static org.junit.Assert.*;

public class StringMethodsExampleTest {

    @Test
    public void abcTest1() {
        boolean result = StringMethodsExample.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result = StringMethodsExample.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = StringMethodsExample.abcTest("abc.123");
        assertEquals(true, result);
    }
}