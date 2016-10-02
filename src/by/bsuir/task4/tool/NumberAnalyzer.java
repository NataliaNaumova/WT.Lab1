package by.bsuir.task4.tool;

import java.util.ArrayList;

/**
 * Created by ASUS on 02.10.2016.
 */
public class NumberAnalyzer {
    public static int[] getIndexesOfPrimeNumebers(int[] array){
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        for(int i=0; i<array.length; i++){
            if (isPrimeNumber(array[i])) {
                resultArray.add(i);
            }
        }
        int[] result = new int[resultArray.size()];
        for(int i=0; i<result.length; i++){
            result[i] = resultArray.get(i);
        }
        return result;
    }

     public static boolean isPrimeNumber(int number){
         if (number==1) return false;
         if (number==2) return true;
         if (number%2==0) return false;
         for(int i=3;i*i<=number;i+=2) {
             if(number%i==0)
                 return false;
         }
         return true;
     }
}
