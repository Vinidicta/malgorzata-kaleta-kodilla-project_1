package com.kodilla.patterns2.observer.homework;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ToString
@Getter
public class Student implements Observable {
    private final String name;
    private final List<Observer> observers = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Task task) {
        for (Observer observer : observers) {
            observer.update(this, task);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
