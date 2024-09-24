package com.satish.assignment_sys.assignment_system.Controller;


import com.satish.assignment_sys.assignment_system.DTO.TaskRequestDTO;
import com.satish.assignment_sys.assignment_system.DTO.TaskResponseDTO;
import com.satish.assignment_sys.assignment_system.Service.All_The_Tasks;
import com.satish.assignment_sys.assignment_system.Service.TaskService;
import com.satish.assignment_sys.assignment_system.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskControl {
    private All_The_Tasks taskService;
    private TaskResponseDTO responseDTO;
    private TaskRequestDTO requestDTO;

    public TaskControl(All_The_Tasks taskService, TaskResponseDTO responseDTO,
                       TaskRequestDTO requestDTO) {
        this.taskService = taskService;
        this.responseDTO = responseDTO;
        this.requestDTO=requestDTO;
    }

    @PostMapping("createTask")
    public TaskResponseDTO getTask(@RequestBody TaskRequestDTO dto) {
      Task response = taskService.createTask(dto.getTaskId(),dto.getTaskName(),
                dto.getTaskDescription(),dto.getTaskDate(),dto.getTaskPriority());

      return responseDTO.convertToTask(response);
    }

    @GetMapping("Task/{Id}")
    public TaskResponseDTO getTask(@PathVariable int Id) {
        Task response = taskService.getTask(Id);
        return responseDTO.convertToTask(response);
    }

    @GetMapping("allTasks")
    public List<TaskResponseDTO> getTasks() {
        List<Task> tasks = taskService.getAllTasks();
        List<TaskResponseDTO> responseDTOs = new ArrayList<TaskResponseDTO>();

        for (Task task : tasks) {
            responseDTOs.add(responseDTO.convertToTask(task));
        }
        return responseDTOs;
    }

//    @GetMapping("Tasks")
//    public List<TaskResponseDTO> getAllTasks() {
//        List<Task> tasks = taskService.getAllTasks();
//        List<TaskResponseDTO> responseDTOs = new ArrayList<TaskResponseDTO>();
//        for (Task task : tasks) {
//            responseDTOs.add(responseDTO.convertToTask(task));
//        }
//        return responseDTOs;
//    }

    @DeleteMapping("task/{Id}")
    public void deleteTaskById(@PathVariable int Id){
        taskService.deleteTask(Id);
    }

}
