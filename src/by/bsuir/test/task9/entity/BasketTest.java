package by.bsuir.test.task9.entity;

import by.bsuir.main.task9.entity.Ball;
import by.bsuir.main.task9.entity.Basket;
import by.bsuir.main.task9.entity.Color;
import by.bsuir.main.task9.tool.BasketManager;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 11.10.2016.
 */
public class BasketTest {

    @Test
    public void test1(){
        Basket basket = new Basket();
        BasketManager.addBall(basket, new Ball(5, Color.BLUE));
        BasketManager.addBall(basket, new Ball(15, Color.GREEN));
        BasketManager.addBall(basket, new Ball(19, Color.RED));
        BasketManager.addBall(basket, new Ball(19, Color.BLUE));

        assertEquals(BasketManager.getWeightOfBalls(basket), 58);
        assertEquals(BasketManager.getBlueBallsCount(basket), 2);
    }

    @Test
    public void test2(){
        Basket basket = new Basket();
        BasketManager.addBall(basket, new Ball(5, Color.BLUE));
        BasketManager.addBall(basket, new Ball(2, Color.RED));
        BasketManager.addBall(basket, new Ball(4, Color.WHITE));

        assertEquals(BasketManager.getWeightOfBalls(basket), 11);
        assertEquals(BasketManager.getBlueBallsCount(basket), 1);
    }
}