package ru.geekbrains.running.competition.model.obstacle;

import ru.geekbrains.running.competition.model.obstacle.Obstacle;
import ru.geekbrains.running.competition.model.runner.Runner;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getLength() {
        return height;
    }

    @Override
    public boolean check(Runner runner) {
        runner.setSuccess(runner.getMaxHeight() >= height);
        return runner.isSuccess();
    }
}
