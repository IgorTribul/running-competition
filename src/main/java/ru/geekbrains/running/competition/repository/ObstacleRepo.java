package ru.geekbrains.running.competition.repository;

import ru.geekbrains.running.competition.model.obstacle.Obstacle;

import java.util.List;

public class ObstacleRepo {

     private List<Obstacle> obstacles;

    public ObstacleRepo(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    public void setObstacles(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }
}
