package ru.geekbrains.running.competition.service;


import ru.geekbrains.running.competition.model.obstacle.Obstacle;
import ru.geekbrains.running.competition.model.runner.Runner;
import ru.geekbrains.running.competition.repository.ObstacleRepository;
import ru.geekbrains.running.competition.repository.RunnerRepository;

public class Competition {
    private ObstacleRepository obstacleRepository;
    private RunnerRepository runnerRepository;

    public Competition(ObstacleRepository obstacleRepository, RunnerRepository runnerRepository) {
        this.obstacleRepository = obstacleRepository;
        this.runnerRepository = runnerRepository;
    }


    public boolean isVictory() {
        if (obstacleRepository.getObstacle().check(runnerRepository.getRunner()))
            return runnerRepository.getRunner().isSuccess();
        ;
//
//        for (int i = 0; i < obstacles.length; i++) {
//            for (Runner runner : runners) {
//                if (runner.isSuccess()) {
//                    obstacles[i].check(runner);
//                }
//                return runner.isSuccess();
//            }
//        }
    return false;
    }

}
