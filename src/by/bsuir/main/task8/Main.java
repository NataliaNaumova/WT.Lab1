package by.bsuir.main.task8;

import by.bsuir.main.task8.tool.ArrayCombiner;

/**
 * Created by ASUS on 10.10.2016.
 */
public class Main {
    public static void main(String[] args){
        double[] firstSequenceTest = {-2, 1, 2, 3, 6};
        double[] secondSequenceTest = {-8, 1, 4, 8};

        int[] positions = ArrayCombiner.getInsertPositions(firstSequenceTest, secondSequenceTest);

        for (int element: positions){
            System.out.print(element+" ");
        }
    }
}
