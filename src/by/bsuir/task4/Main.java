package by.bsuir.task4;

import by.bsuir.task4.tool.Printer;
import by.bsuir.task4.tool.NumberAnalyzer;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Printer.printArray(NumberAnalyzer.getIndexesOfPrimeNumebers(new int[]{4, 6, 9, 12, 3, 1, 2, 7, 11, 19, 8, 41}));
    }
}

