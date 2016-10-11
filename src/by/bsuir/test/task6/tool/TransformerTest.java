package by.bsuir.test.task6.tool;

import by.bsuir.main.task6.tool.Transformer;
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
public class TransformerTest {

    private double[] inputArray;
    private double[][] resultMatrix;

    public TransformerTest(double[] inputArray, double[][] resultMatrix) {
        this.inputArray = inputArray;
        this.resultMatrix = resultMatrix;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        Object[][] data = {
                {inputArrays[0], resultMatrices[0]},
                {inputArrays[1], resultMatrices[1]},
                {inputArrays[2], resultMatrices[2]}
        };

        return Arrays.asList(data);
    }

    private static double[][] inputArrays = {{1,3,5}, {2,6,8}, {18,3,9}};

    private static double[][][] resultMatrices = {
            {{1,3,5}, {3,5,1}, {5,1,3}},
            {{2,6,8}, {6,8,2}, {8,2,6}},
            {{18,3,9}, {3,9,18}, {9,18,3}}};

    @Test
    public void test() throws Exception {
        for(int i=0; i<resultMatrix.length; i++){
            assertArrayEquals(Transformer.transformArrayToMatrix(inputArray)[i], resultMatrix[i], 0.0001);
        }
    }
}