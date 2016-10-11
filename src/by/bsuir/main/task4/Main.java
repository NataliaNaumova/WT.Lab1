package by.bsuir.main.task4;

import by.bsuir.main.task4.tool.Printer;
import by.bsuir.main.task4.tool.NumberAnalyzer;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Printer.printArray(NumberAnalyzer.getIndexesOfPrimeNumbers(new int[]{4, 6, 9, 12, 3, 1, 2, 7, 11, 19, 8, 41}));
    }
}

