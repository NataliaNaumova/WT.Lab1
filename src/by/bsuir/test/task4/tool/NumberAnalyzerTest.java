package by.bsuir.test.task4.tool;

import by.bsuir.main.task3.tool.Calculator;
import by.bsuir.main.task4.tool.NumberAnalyzer;
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
public class NumberAnalyzerTest {

    private int[] array;
    private int[] result;

    public NumberAnalyzerTest(int[] array, int[] result) {
        this.array = array;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        Object[][] data = {
                {inputArrays[0], resultArrays[0]},
                {inputArrays[1], resultArrays[1]},
                {inputArrays[2], resultArrays[2]}
        };

        return Arrays.asList(data);
    }

    private static int[][] inputArrays = {{1,3,5,10,12,7}, {2,6,5,19,13,7}, {18,3,9,41,12,4}};

    private static int[][] resultArrays = {{1,2,5}, {0,2,3,4,5}, {1,3}};

    @Test
    public void test() throws Exception {
        assertArrayEquals(NumberAnalyzer.getIndexesOfPrimeNumbers(array), result);
    }
}