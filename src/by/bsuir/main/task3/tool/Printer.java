package by.bsuir.main.task3.tool;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Printer {
    public static void printResult(double[][] table){
        for(double[] result : table){
            System.out.print(result[0]+" "+result[1]);
            System.out.println();
        }
    }
}
