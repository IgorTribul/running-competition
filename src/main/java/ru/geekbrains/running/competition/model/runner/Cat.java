package ru.geekbrains.running.competition.model.runner;

public class Cat implements Runner {

    private String name;
    private int maxLength;
    private int maxHeight;


    public Cat (String name, int maxLength, int maxHeight) {
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", maxLength=" + maxLength +
                ", maxHeight=" + maxHeight +
                '}';
    }


}


