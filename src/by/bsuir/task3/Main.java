package by.bsuir.task3;

import by.bsuir.task3.tool.Calculator;
import by.bsuir.task3.tool.Printer;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Printer.printArray(Calculator.calculateTanOnInterval(4,10, 2));
    }
}
