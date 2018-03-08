package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuit {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //given
        TaskList taskList = new TaskList("In progress", "tasks which are still in progress");
        taskListDao.save(taskList);

        //when
        int id = taskList.getId();
        String listName = taskList.getListName();
        List<TaskList> readTasks = taskListDao.findByListName(listName);

        //then
        Assert.assertEquals(1, readTasks.size());

        //clean up
        taskListDao.delete(id);
    }
}
