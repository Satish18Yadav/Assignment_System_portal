package com.satish.assignment_sys.assignment_system.Service;

import com.satish.assignment_sys.assignment_system.DTO.TaskResponseDTO;
import com.satish.assignment_sys.assignment_system.Repository.TaskRepo;
import com.satish.assignment_sys.assignment_system.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements  All_The_Tasks{
    private TaskResponseDTO dto;
    private AsigneeService asigneeService;
    private TaskRepo taskRepository;

    public TaskService(TaskResponseDTO dto,AsigneeService asigneeService,
                       TaskRepo taskRepository) {
        this.dto = dto;
        this.asigneeService = asigneeService;
        this.taskRepository = taskRepository;
    }

    @Override
    public Task getTask(int id) {
        Task task = taskRepository.findTaskById(id);
        return task;
    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }


    @Override
    public List<Task> getAllTasks() {
        List<Task> allTasks= taskRepository.findAll();
        return allTasks;
    }

    @Override
    public Task createTask(Integer taskId, String taskName, String taskDescription, String taskDate,
                           String taskPriority) {
        Task task = new Task();
        task.setId(null);
        task.setTaskName(taskName);
        task.setDescription(taskDescription);
        task.setPriority(taskPriority);
        task.setDate(taskDate);
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }
}
