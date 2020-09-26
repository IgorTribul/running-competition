package ru.geekbrains.running.competition.model.runner;

public class Human implements Runner {

    private int maxLength;
    private int maxHeight;
    private boolean success;

    public Human(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void setSuccess(boolean success) {
        this.success = success;

    }

}
