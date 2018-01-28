package com.kodilla.patterns.factory.tasks;

public class PaintingTask extends AbstractTask {
    private final String taskName;
    private final String color;
    private final String whatToPaint;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }


    @Override
    public void executeInternal() {
        System.out.println("Paint " + whatToPaint + " in " + color);

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

}
