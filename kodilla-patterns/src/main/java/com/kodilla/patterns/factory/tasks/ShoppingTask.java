package com.kodilla.patterns.factory.tasks;

public class ShoppingTask extends AbstractTask {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;


    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public void executeInternal() {
        System.out.println("I have to buy " + quantity + " " + whatToBuy);

    }

    @Override
    public String getTaskName() {
        return taskName;
    }


}
