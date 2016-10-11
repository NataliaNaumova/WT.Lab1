package by.bsuir.main.task7;

import by.bsuir.main.task7.tool.Generator;
import by.bsuir.main.task7.tool.Printer;
import by.bsuir.main.task7.tool.Sorter;

/**
 * Created by ASUS on 10.10.2016.
 */
public class Main {
    public static void main(String[] args){
        double[] array = Generator.generateArray(10);
        Printer.printArray(array);
        Sorter.sort(array);
        Printer.printArray(array);
    }
}
