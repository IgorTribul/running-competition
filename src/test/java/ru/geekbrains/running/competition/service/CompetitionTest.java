package ru.geekbrains.running.competition.service;

import org.junit.jupiter.api.Test;
import ru.geekbrains.running.competition.model.obstacle.Obstacle;
import ru.geekbrains.running.competition.model.obstacle.ObstacleType;
import ru.geekbrains.running.competition.model.obstacle.Treadmill;
import ru.geekbrains.running.competition.model.obstacle.Wall;
import ru.geekbrains.running.competition.model.runner.Human;
import ru.geekbrains.running.competition.model.runner.Robot;
import ru.geekbrains.running.competition.model.runner.Runner;
import ru.geekbrains.running.competition.repository.ObstacleRepo;
import ru.geekbrains.running.competition.repository.RunnerRepo;

import java.util.ArrayList;
import java.util.List;

class CompetitionTest {

    @Test
    void isVictory() {
        Obstacle obstacle1 = new Wall(ObstacleType.WALL, 10);
        Obstacle obstacle2 = new Treadmill(ObstacleType.TREADMILL, 15);
        List<Obstacle> obstacles = new ArrayList<Obstacle>();
        obstacles.add(obstacle1);
        obstacles.add(obstacle2);

        Runner  runner3 = new Human("Anton", 15, 5);
        Runner  runner2 = new Robot("Maria", 10, 30);
        Runner  runner1 = new Robot("Gogi", 30, 30);

        List<Runner> runners = new ArrayList<Runner>();
        runners.add(runner3);
        runners.add(runner2);
        runners.add(runner1);

        ObstacleRepo obstacleRepo = new ObstacleRepo(obstacles);
        RunnerRepo runnerRepo = new RunnerRepo(runners);

        Competition competition = new Competition(obstacleRepo, runnerRepo);

       List<Runner> actual = competition.isVictory();

        System.out.println(actual);

    };
}