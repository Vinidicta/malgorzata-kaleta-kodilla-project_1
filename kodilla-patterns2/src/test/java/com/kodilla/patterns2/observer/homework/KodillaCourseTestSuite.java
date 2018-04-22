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
        annaNowak.putTask(1.3, new Task("Brave Knight"));
        annaNowak.putTask(1.4, new Task("Bank Transaction"));
        janKowalski.putTask(20.2, new Task("Decorate pizza"));
        marcinKrawczyk.putTask(20.2, new Task("Decorate pizza"));
        //Then
        assertEquals(2, agataNowakowska.getUpdateCount());
        assertEquals(2, adamKowal.getUpdateCount());
    }
}
