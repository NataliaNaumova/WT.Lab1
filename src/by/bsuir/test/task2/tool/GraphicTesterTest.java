package by.bsuir.test.task2.tool;

import by.bsuir.main.task2.geometrictype.Point;
import by.bsuir.main.task2.tool.GraphicTester;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 10.10.2016.
 */
@RunWith(Parameterized.class)
public class GraphicTesterTest {

    private int x;
    private int y;
    private boolean result;

    public GraphicTesterTest(int x, int y, boolean result){
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        Object[][] data = {
                {-3, 4, true},
                {1, 1, true},
                {2, 0, true},
                {-4, -2, true},
                {14, -2, false},
                {12, 0, false}
        };

        return Arrays.asList(data);
    }

    @Test
    public void test() {
        assertEquals(GraphicTester.isInFilledRegion(new Point(x, y)), result);
    }
}