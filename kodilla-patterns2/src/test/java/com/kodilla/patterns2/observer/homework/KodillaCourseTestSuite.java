package com.kodilla.patterns2.observer.homework;


import static org.junit.Assert.*;

import org.junit.Test;

public class KodillaCourseTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Mentor agataNowakowska = new Mentor("Agata Nowakowska");
        Mentor adamKowal = new Mentor("Adam Kowal");
        Student annaNowak = new Student("Anna Nowak");
        Student janKowalski = new Student("Jan Kowalski");
        Student marcinKrawczyk = new Student("Marcin Krawczyk");
        annaNowak.registerObserver(adamKowal);
        janKowalski.registerObserver(agataNowakowska);
        marcinKrawczyk.registerObserver(agataNowakowska);
        //When
        annaNowak.notifyObservers( new Task("Brave Knight", "1.3"));
        annaNowak.notifyObservers( new Task("Bank Transaction", "1.4"));
        janKowalski.notifyObservers( new Task("Decorate pizza", "20.2"));
        marcinKrawczyk.notifyObservers( new Task("Decorate pizza", "20.2"));
        //Then
        assertEquals(2, agataNowakowska.getUpdateCount());
        assertEquals(2, adamKowal.getUpdateCount());
    }
}
