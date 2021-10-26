package ThirdTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestMain {

    private int[] in;
    private boolean out;

    public TestMain(int[] in, boolean out) {
        this.in = in;
        this.out = out;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 4, 1, 5, 9, 4, 4, 7, 4, 8, 6}, true},
                {new int[]{4, 9, 8, 7, 6, 5, 4, 3, 2, 1}, true},
                {new int[]{2, 3, 6, 7, 9}, false},
                {new int[]{8, 30, 61, 72, 9, 4, 66}, true},
        });
    }

    @Test
    public void test() {
        Assert.assertEquals(Main.doIt(in), out);
    }
}
