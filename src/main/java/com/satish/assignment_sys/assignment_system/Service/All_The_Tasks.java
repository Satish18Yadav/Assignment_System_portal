package com.satish.assignment_sys.assignment_system.Service;

import com.satish.assignment_sys.assignment_system.model.Task;

import java.util.ArrayList;
import java.util.List;

public interface All_The_Tasks {


    public Task updateTask(Task task);
    public Task getTask(int id);
    public List<Task> getAllTasks();
    public void deleteTask(int id);
    public Task createTask(Integer taskId, String taskName, String taskDescription, String taskPriority, String taskDate);
}
