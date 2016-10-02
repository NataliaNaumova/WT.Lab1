package by.bsuir.task9.tool;

import by.bsuir.task9.entity.Ball;
import by.bsuir.task9.entity.Basket;
import by.bsuir.task9.entity.Color;

/**
 * Created by ASUS on 02.10.2016.
 */
public class BasketManager {
    public static void addBall(Basket basket, Ball ball){
        basket.getBalls().add(ball);
    }

    public static void deleteBall(Basket basket, Ball ball){
        basket.getBalls().remove(ball);
    }

    public static int getWeightOfBalls(Basket basket){
        int weight = 0;
        for (Ball ball: basket.getBalls()){
            weight += ball.getWeight();
        }
        return weight;
    }

    public static int getBlueBallsCount(Basket basket){
        int count = 0;
        for (Ball ball: basket.getBalls()){
            if (ball.getColor() == Color.BLUE){
                count++;
            }
        }
        return count;
    }
}
