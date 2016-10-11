package by.bsuir.test.task1.tool;

import by.bsuir.main.task1.tool.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 06.10.2016.
 */
@RunWith(Parameterized.class)
public class CalculatorTest {

    private double x;
    private double y;
    private double result;

    public CalculatorTest(double x, double y, double result){
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Double[]> testData(){
        Double[][] data = {
                {1.0 ,2.0, 1.392274},
                {0.0, 0.0, 0.5},
                {0.0, 1.0, 0.854036},
                {2.0, 2.0, 2.417761},
        };

        return Arrays.asList(data);
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(result, Calculator.calculateFormula1(x,y), 0.000001);
    }
}