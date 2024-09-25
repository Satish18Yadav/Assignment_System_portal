package com.satish.assignment_sys.assignment_system.Service;

import com.satish.assignment_sys.assignment_system.DTO.TaskResponseDTO;
import com.satish.assignment_sys.assignment_system.Repository.UserRepo;
import com.satish.assignment_sys.assignment_system.Repository.TaskRepo;
import com.satish.assignment_sys.assignment_system.model.Task;
import com.satish.assignment_sys.assignment_system.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements  All_The_Tasks{
    private TaskResponseDTO dto;
    private UserService userService;
    private TaskRepo taskRepository;
    private  UserRepo userRepo;

    public TaskService(TaskResponseDTO dto, UserService userService,
                       TaskRepo taskRepository,
                       UserRepo userRepo) {
        this.dto = dto;
        this.userService = userService;
        this.taskRepository = taskRepository;
        this.userRepo = userRepo;
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
       // List<Users> asn =userRepo.findAll();
        return allTasks;
    }

    @Override
    public Task createTask(Integer taskId, String taskName, String taskDescription, String taskDate,
                           String taskPriority, Integer userId,String loginName,String password) {
        Task task = new Task();
        task.setId(taskId);
        task.setTaskName(taskName);
        task.setDescription(taskDescription);
        task.setPriority(taskPriority);
        task.setDate(taskDate);
        task.setLoginName(loginName);
        task.setUserId(userId);
        task.setPassword(password);
        Users use = new Users();
        use.setName(loginName);
        use.setPassword(password);
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }
}
