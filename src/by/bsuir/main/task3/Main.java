package by.bsuir.main.task3;

import by.bsuir.main.task3.tool.Calculator;
import by.bsuir.main.task3.tool.Printer;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Printer.printResult(Calculator.calculateTanOnInterval(1, 5, 1));
    }
}
