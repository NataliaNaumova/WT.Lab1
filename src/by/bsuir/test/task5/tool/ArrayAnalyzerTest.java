package by.bsuir.test.task5.tool;

import by.bsuir.main.task5.tool.ArrayAnalyzer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 11.10.2016.
 */
@RunWith(Parameterized.class)
public class ArrayAnalyzerTest {

    private int[] inputArray;
    private int result;

    public ArrayAnalyzerTest(int[] inputArray, int result) {
        this.inputArray = inputArray;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        Object[][] data = {
                {inputArrays[0], 1},
                {inputArrays[1], 2},
                {inputArrays[2], 3}
        };

        return Arrays.asList(data);
    }

    private static int[][] inputArrays = {{1,3,5,10,12,7}, {2,6,8,19,13,7}, {18,3,9,41,12,4}};

    @Test
    public void test() throws Exception {
        Assert.assertEquals(ArrayAnalyzer.getMinimalCountOfElementsToRemove(inputArray), result);
    }
}