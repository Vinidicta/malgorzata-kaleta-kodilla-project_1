package com.kodilla.patterns.factory.tasks;

public abstract class AbstractTask implements Task {
    private boolean isCompleted;

    public abstract void executeInternal();

    @Override
    public void executeTask() {
        executeInternal();
        isCompleted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isCompleted;
    }
}
