package ru.geekbrains.running.competition.repository;

import ru.geekbrains.running.competition.model.obstacle.Obstacle;
import ru.geekbrains.running.competition.model.runner.Runner;

import java.util.Set;

public class RunnerRepository {

    Set<Runner> runners;

    public RunnerRepository(Set<Runner> runners) {
        this.runners = runners;
    }

    public Runner getRunner(){

        return runners.iterator().next();
    };
}
