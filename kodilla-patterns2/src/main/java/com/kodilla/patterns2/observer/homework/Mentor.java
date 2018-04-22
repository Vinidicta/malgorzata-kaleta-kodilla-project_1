package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String studentName;
    private int updateCount;

    public Mentor(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void update(Student student) {
        System.out.println("You have new pending task to review from student: " + student.getName() + "\n" +
                "To review is task number: " + student.getTaskList().keySet() + " " + student.getTaskList().values() +
                "\n" + " (total: " + student.getTaskList().size() + " messages.)");
        updateCount++;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
