package by.bsuir.task3.tool;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Calculator {
    public static double[] calculateTanOnInterval(double a, double b, double h){
        double[] result = new double[(int)((b-a)/h)+1];
        for(int i=0; i<result.length; i++){
            result[i] = Math.tan(a);
            a+=h;
        }
        return result;
    }
}
