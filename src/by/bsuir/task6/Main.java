package by.bsuir.task6;

import by.bsuir.task6.tool.Printer;
import by.bsuir.task6.tool.Transformer;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Printer.printMatrix(Transformer.transformArrayToMatrix(new double[]{4, 7, 12, 42, 53}));
    }
}
