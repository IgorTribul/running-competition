package ru.geekbrains.running.competition.model.obstacle;

public class Treadmill implements Obstacle {

    private ObstacleType type;
    private int length;

    public Treadmill(ObstacleType type, int length) {
        this.type = type;
        this.length = length;
    }

    public ObstacleType getType() {
        return type;
    }

    public void setType(ObstacleType type) {
        this.type = type;
    }

    public int getValue() {
        return length;
    }

    public void setValue(int length) {
        this.length = length;
    }
}
