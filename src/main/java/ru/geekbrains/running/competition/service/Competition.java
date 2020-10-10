package ru.geekbrains.running.competition.service;


import ru.geekbrains.running.competition.model.obstacle.Obstacle;
import ru.geekbrains.running.competition.model.runner.Runner;
import ru.geekbrains.running.competition.repository.ObstacleRepo;
import ru.geekbrains.running.competition.repository.RunnerRepo;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private ObstacleRepo obstacleRepo;
    private RunnerRepo runnerRepo;

    public Competition(ObstacleRepo obstacleRepo, RunnerRepo runnerRepo) {
        this.obstacleRepo = obstacleRepo;
        this.runnerRepo = runnerRepo;
    }

    public List<Runner> isVictory() {
        List<Runner> winnerList = new ArrayList<Runner>();
        winnerList.addAll(runnerRepo.getRunners());
        for (Obstacle o : obstacleRepo.getObstacles()) {
            for (Runner r : runnerRepo.getRunners()) {
                switch (o.getType()) {
                    case WALL:
                        if (r.getJump() < o.getValue()) {
                            winnerList.remove(r);
                            break;
                        }
                    case TREADMILL:
                        if (r.getRun() < o.getValue()) {
                            winnerList.remove(r);
                            break;
                        }
                }
            }
        }
        return winnerList;
    }
}
