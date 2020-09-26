package ru.geekbrains.running.competition.repository;

import ru.geekbrains.running.competition.model.obstacle.Obstacle;

import java.util.Set;

public class ObstacleRepository {

     Set<Obstacle> obstacles;

    public ObstacleRepository(Set<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public Obstacle getObstacle(){

        return obstacles.iterator().next();
    };
}
