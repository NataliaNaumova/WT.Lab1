package by.bsuir.test.task3.tool;

import by.bsuir.main.task3.tool.Calculator;
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
public class CalculatorTest {

    private double a;
    private double b;
    private double h;
    private double[][] result;

    public CalculatorTest(double a, double b, double h, double[][] result){
        this.a = a;
        this.b = b;
        this.h = h;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        Object[][] data = {
                {4, 10, 2, expectedResult1},
                {1, 5, 1, expectedResult2}
        };
        return Arrays.asList(data);
    }

    private static double[][] expectedResult1 = {
            {4.0, 1.1578},
            {6.0, -0.291},
            {8.0, -6.7997},
            {10.0, 0.6483}
    };

    private static double[][] expectedResult2 = {
            {1.0, 1.5574},
            {2.0, -2.185},
            {3.0, -0.1425},
            {4.0, 1.1578},
            {5.0, -3.3805}
    };

    @Test
    public void test() throws Exception {
        for(int i=0; i<result.length; i++) {
            assertArrayEquals(Calculator.calculateTanOnInterval(a, b, h)[i], result[i], 0.0001);
        }
    }
}