package ru.geekbrains.running.competition.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.running.competition.model.obstacle.Obstacle;
import ru.geekbrains.running.competition.model.obstacle.Treadmill;
import ru.geekbrains.running.competition.model.obstacle.Wall;
import ru.geekbrains.running.competition.model.runner.Human;
import ru.geekbrains.running.competition.model.runner.Robot;
import ru.geekbrains.running.competition.model.runner.Runner;
import ru.geekbrains.running.competition.repository.ObstacleRepository;
import ru.geekbrains.running.competition.repository.RunnerRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CompetitionTest {

    @Test
    void isVictory() {
        Obstacle obstacle1 = new Wall(10);
        Obstacle obstacle2 = new Treadmill(15);
        Set<Obstacle> obstacles = new HashSet<Obstacle>();
        obstacles.add(obstacle1);
        obstacles.add(obstacle2);

        Runner  runner3 = new Human(5, 15);
        Runner  runner2 = new Robot(25, 20);
        Set<Runner> runners = new HashSet<Runner>();
        runners.add(runner3);
        runners.add(runner2);

        ObstacleRepository obstacleRepository = new ObstacleRepository(obstacles);
        RunnerRepository runnerRepository = new RunnerRepository(runners);

        Competition competition = new Competition(obstacleRepository, runnerRepository);

       boolean actual = competition.isVictory();

        Assertions.assertTrue(actual);

    };
}