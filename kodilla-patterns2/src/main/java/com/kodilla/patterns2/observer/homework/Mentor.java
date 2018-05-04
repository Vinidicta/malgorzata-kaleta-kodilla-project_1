package com.kodilla.patterns2.observer.homework;

import lombok.Getter;

@Getter
public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student, Task task) {
        System.out.println("Got update: " + task.getName() + " " + task.getNumber() + " from student: "
                + student.getName());
        updateCount++;
    }
}
