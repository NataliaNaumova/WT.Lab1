package by.bsuir.main.task7.tool;

import java.util.Random;

/**
 * Created by ASUS on 10.10.2016.
 */
public class Generator {
    public static double[] generateArray(int size){
        Random random = new Random();
        double[] array = new double[size];
        for(int i=0; i<size; i++){
            array[i] = random.nextDouble();
        }
        return array;
    }
}
