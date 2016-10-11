package by.bsuir.main.task6.tool;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Transformer {
    public static double[][] transformArrayToMatrix(double[] array){
        double[][] result = new double[array.length][array.length];
        for(int i=0; i< array.length; i++){
            result[i] = array.clone();
            array = leftShift(array);
        }
        return result;
    }

    private static double[] leftShift(double[] array){
        double[] resultArray = new double[array.length];
        for(int i=0; i<array.length-1; i++){
            resultArray[i] = array[i+1];
        }
        resultArray[array.length-1] = array[0];
        return resultArray;
    }
}
