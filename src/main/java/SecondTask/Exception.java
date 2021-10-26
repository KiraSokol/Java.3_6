package SecondTask;

import org.junit.Test;


public class Exception {
    @Test(expected = RuntimeException.class)
    public void testException() {
        Main.doIt(new int[]{1, 3, 7, 5, 2, 3, 8, 2, 1});
    }
}
