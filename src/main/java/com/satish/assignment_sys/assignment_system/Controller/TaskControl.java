package com.satish.assignment_sys.assignment_system.Controller;


import com.satish.assignment_sys.assignment_system.DTO.LoginRequestDTO;
import com.satish.assignment_sys.assignment_system.DTO.TaskRequestDTO;
import com.satish.assignment_sys.assignment_system.DTO.TaskResponseDTO;
import com.satish.assignment_sys.assignment_system.Service.All_The_Tasks;
import com.satish.assignment_sys.assignment_system.Service.All_the_Users;
import com.satish.assignment_sys.assignment_system.Service.TaskService;
import com.satish.assignment_sys.assignment_system.model.Task;
import com.satish.assignment_sys.assignment_system.model.Users;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskControl {
    private All_The_Tasks taskService;
    private All_the_Users userService;
    private TaskResponseDTO responseDTO;
    private TaskRequestDTO requestDTO;

    public TaskControl(All_The_Tasks taskService, TaskResponseDTO responseDTO,
                       TaskRequestDTO requestDTO, All_the_Users userService) {
        this.taskService = taskService;
        this.responseDTO = responseDTO;
        this.requestDTO=requestDTO;
        this.userService=userService;
    }

    @PostMapping("createTask")
    public TaskResponseDTO getTask(@RequestBody TaskRequestDTO dto, @RequestBody LoginRequestDTO dto2) {
      Task response = taskService.createTask(dto.getTaskId(),dto.getTaskName(),
                dto.getTaskDescription(),dto.getTaskDate(),dto.getTaskPriority(),
              dto.getUserId(),dto2.getName(),dto2.getPassword());

      Users use = userService.getUserById(dto.getUserId());


      return responseDTO.convertToTask(response);
    }

    @GetMapping("Task/{Id}/")
    public TaskResponseDTO getTask(@PathVariable int Id) {
        Task response = taskService.getTask(Id);
        //Users useInfo=userService.getUserById(userId);
        return responseDTO.convertToTask(response);
    }

    @GetMapping("allTasks")
    public List<TaskResponseDTO> getTasks() {
        List<Task> tasks = taskService.getAllTasks();


        // Convert tasks and users to a list of TaskResponseDTO
        List<TaskResponseDTO> responseDTOs = new ArrayList<>();
        for (Task task : tasks) {
            responseDTOs.add(responseDTO.convertToTask(task));
        }
        return responseDTOs;
    }



    @DeleteMapping("task/{Id}")
    public void deleteTaskById(@PathVariable int Id){
        taskService.deleteTask(Id);
    }



}
