package by.bsuir.task9.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Basket {
    private List<Ball> balls;

    public Basket() {
        balls = new ArrayList<Ball>();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }
}
