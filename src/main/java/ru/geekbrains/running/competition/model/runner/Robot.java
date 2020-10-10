package ru.geekbrains.running.competition.model.runner;

public class Robot implements Runner {

    private String name;
    private int maxLength;
    private int maxHeight;


    public Robot(String name, Integer maxLength, Integer maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getRun (){
        return maxLength;
    }


    @Override
    public int getJump() {
        return maxHeight;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", maxLength=" + maxLength +
                ", maxHeight=" + maxHeight +
                '}';
    }
}