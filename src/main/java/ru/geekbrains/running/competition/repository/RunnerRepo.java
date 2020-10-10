package ru.geekbrains.running.competition.repository;

import ru.geekbrains.running.competition.model.runner.Runner;

import java.util.Iterator;
import java.util.List;


public class RunnerRepo {

    private List<Runner> runners;

    public RunnerRepo(List<Runner> runners) {
        this.runners = runners;
    }

    public List<Runner> getRunners() {
        return runners;
    }

    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }
}
