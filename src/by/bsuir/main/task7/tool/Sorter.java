package by.bsuir.main.task7.tool;

/**
 * Created by ASUS on 10.10.2016.
 */
public class Sorter {
    public static double[] sort(double[] array){
        int step = array.length / 2;//инициализируем шаг.
        while (step > 0)//пока шаг не 0
        {
            for (int i = 0; i < (array.length - step); i++)
            {
                int j = i;
                while (j >= 0 && array[j] > array[j + step])
                {
                    swapElements(array, j, j+step);
                    j--;
                }
            }
            step = step / 2;
        }
        return array;
    }

    private static void swapElements(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
