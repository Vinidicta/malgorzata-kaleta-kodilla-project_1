package com.kodilla.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {



    @Bean
    public Board board() {
        return new Board(newToDoList(), newInProgressList(), newDoneList());
    }

    @Bean(name = "toDoList")
    public TaskList newToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList newInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList newDoneList() {
        return new TaskList();
    }
}
