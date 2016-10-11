package by.bsuir.main.task9;

import by.bsuir.main.task9.entity.Ball;
import by.bsuir.main.task9.entity.Basket;
import by.bsuir.main.task9.entity.Color;
import by.bsuir.main.task9.tool.BasketManager;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        BasketManager.addBall(basket, new Ball(5, Color.BLUE));
        BasketManager.addBall(basket, new Ball(15, Color.GREEN));
        BasketManager.addBall(basket, new Ball(19, Color.RED));
        BasketManager.addBall(basket, new Ball(19, Color.BLUE));

        System.out.printf("Weight of basket = %d\n", BasketManager.getWeightOfBalls(basket));
        System.out.printf("Blue balls count in basket = %d\n", BasketManager.getBlueBallsCount(basket));
    }
}
