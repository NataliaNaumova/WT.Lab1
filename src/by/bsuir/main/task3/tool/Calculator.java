package by.bsuir.main.task3.tool;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Calculator {
    public static double[][] calculateTanOnInterval(double a, double b, double h){
        double[][] result = new double[(int)((b-a)/h)+1][2];
        for(int i=0; i<result.length; i++){
            result[i][0] = a;
            result[i][1] = Math.tan(a);
            a+=h;
        }
        return result;
    }
}
