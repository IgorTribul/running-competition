package ru.geekbrains.running.competition.model.obstacle;

import ru.geekbrains.running.competition.model.runner.Runner;

public class Treadmill implements Obstacle {

    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean check(Runner runner) {
        runner.setSuccess(runner.getMaxLength() >= length);
        return runner.isSuccess();
    }
}
