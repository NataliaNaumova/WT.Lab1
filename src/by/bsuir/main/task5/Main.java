package by.bsuir.main.task5;


import by.bsuir.main.task5.tool.ArrayAnalyzer;

import java.util.Random;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int[] array = new int[10];
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(20) - 10;
        }
        for(int number: array){
            System.out.print(number+ " ");
        }
        System.out.println();
        int count = ArrayAnalyzer.getMinimalCountOfElementsToRemove(array);
        System.out.println(count);
    }
}
