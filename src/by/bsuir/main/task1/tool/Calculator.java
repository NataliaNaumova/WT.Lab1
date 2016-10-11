package by.bsuir.main.task1.tool;

import java.lang.Math;

/**
 * Created by Natalia on 24.09.2016.
 */
public class Calculator {

    public static double calculateFormula1(double x, double y){
        try {
            double numerator = 1 + Math.pow((Math.sin(x + y)), 2);
            double denominator = 2 + Math.abs(x - ((2 * x) / (1 + Math.pow((x * y), 2))));
            return (numerator / denominator) + x;
        }
        catch (ArithmeticException e){
            System.out.println("Forbidden operation.");
            return 0;
        }
    }

}
