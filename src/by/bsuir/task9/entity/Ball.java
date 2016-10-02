package by.bsuir.task9.entity;

/**
 * Created by ASUS on 02.10.2016.
 */
public class Ball {
    private int weight;
    private Color color;

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
