package com.kodilla.patterns2.observer.homework;

public class Task {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
