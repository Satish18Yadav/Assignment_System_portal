package com.satish.assignment_sys.assignment_system.Service;

import com.satish.assignment_sys.assignment_system.model.Task;
import com.satish.assignment_sys.assignment_system.model.Users;

import java.util.List;

public interface All_The_Tasks {


    public Task updateTask(Task task);
    public Task getTask(int id);
    public List<Task> getAllTasks();
    public void deleteTask(int id);
    public Task createTask(Integer taskId, String taskName,
                           String taskDescription, String taskPriority,
                           String taskDate, Integer userId,String loginName,String password);

  //  List<Task> getAllTasks(Task task, Users users);
}
