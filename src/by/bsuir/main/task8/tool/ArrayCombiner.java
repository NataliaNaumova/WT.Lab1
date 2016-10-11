package by.bsuir.main.task8.tool;

import java.util.Arrays;

/**
 * Created by ASUS on 10.10.2016.
 */
public class ArrayCombiner {
    public static int[] getInsertPositions(double[] firstSequence, double[] secondSequence) {
        int[] indicesOfElementsToInsert = new int[secondSequence.length];

        for (int i = 0; i < secondSequence.length; i++) {
            int indexElementToInsert = Arrays.binarySearch(firstSequence, secondSequence[i]);
            indicesOfElementsToInsert[i] = (indexElementToInsert < 0) ? Math.abs(indexElementToInsert) - 1 : indexElementToInsert + 1;
        }

        return indicesOfElementsToInsert;
    }
}
