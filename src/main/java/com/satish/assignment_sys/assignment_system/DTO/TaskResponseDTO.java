package com.satish.assignment_sys.assignment_system.DTO;

import com.satish.assignment_sys.assignment_system.model.Task;
import com.satish.assignment_sys.assignment_system.model.Users;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Setter
@Getter
public class TaskResponseDTO {

    private String taskName;
    private String taskDescription;
    private int task_status;
    private String taskDate;
    private String taskPriority;
    private Integer userId;

    public TaskResponseDTO convertToTask(Task task) {
        TaskResponseDTO newTask = new TaskResponseDTO();
        newTask.setTaskName(task.getTaskName());
        newTask.setTaskDescription(task.getDescription());
        newTask.setTaskDate(task.getDate());
        newTask.setTaskPriority(task.getPriority());
       // newTask.setUserId(task.getUserId());
        return newTask;
    }


}
