package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Observable {
    private final String name;
    private final List<Observer> observers = new ArrayList<>();
    private final Map<Double, Task> taskList = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public Map<Double, Task> getTaskList() {
        return taskList;
    }

    public String getName() {

        return name;
    }

    public void putTask(Double taskNumber, Task task) {
        taskList.put(taskNumber, task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
