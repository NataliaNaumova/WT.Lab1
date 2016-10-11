package by.bsuir.main.task5.tool;

/**
 * Created by ASUS on 05.10.2016.
 */
public class ArrayAnalyzer {
    public static int getMinimalCountOfElementsToRemove(int[] array){
        int result = array.length;
        if(result > 1){
            result -= getMaxIncreaseSequence(array);
        }
        return result;
    }

    private static int getMaxIncreaseSequence(int[] array){
        int length = array.length;
        int [] sequenceLength = new int[length];
        for (int i = 0; i < length; i++) {
            sequenceLength[i] = 1;
        }

        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < i; j++){
                if (array[i] > array[j] && sequenceLength[i] < sequenceLength[j] + 1) {
                    sequenceLength[i] = sequenceLength[j] + 1;
                }
            }
        }

        return getMaxNumber(sequenceLength);
    }

    private static int getMaxNumber(int[] sequenceLength) {
        int max = 0;
        for (int i : sequenceLength){
            if (i > max){
                max = i;
            }
        }
        return max;
    }

}
