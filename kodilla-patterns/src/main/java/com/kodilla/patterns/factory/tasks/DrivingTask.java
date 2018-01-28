package com.kodilla.patterns.factory.tasks;

public class DrivingTask extends AbstractTask {
    private final String taskName;
    private final String where;
    private final String using;


    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeInternal() {
        System.out.println("I am driving to " + where + " by " + using);

    }

    @Override
    public String getTaskName() {
        return taskName;
    }


}
