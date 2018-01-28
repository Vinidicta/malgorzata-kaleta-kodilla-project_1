package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping task", "dress", 1.0);
            case PAINTING:
                return new PaintingTask("Painting task", "green", "window");
            case DRIVING:
                return new DrivingTask("Driving task", "home", "car");
            default:
                return null;
        }
    }
}
