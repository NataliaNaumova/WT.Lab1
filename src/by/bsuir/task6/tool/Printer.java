package by.bsuir.task6.tool;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Printer {
    public static void printMatrix(double[][] matrix){
        for(double[] array :matrix){
            for(double value :array){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
