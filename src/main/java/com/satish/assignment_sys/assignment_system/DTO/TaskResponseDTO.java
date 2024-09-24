package com.satish.assignment_sys.assignment_system.DTO;

import com.satish.assignment_sys.assignment_system.model.Task;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Setter
@Getter
public class TaskResponseDTO {

    private String taskName;
    private String taskDescription;
    private int task_status;
    private String taskDate;
    private String taskPriority;

    public TaskResponseDTO convertToTask(Task task) {
        TaskResponseDTO newTask = new TaskResponseDTO();
        newTask.setTaskName(task.getTaskName());
        newTask.setTaskDescription(task.getDescription());
        newTask.setTaskDate(task.getDate());
        newTask.setTaskPriority(task.getPriority());
        return newTask;
    }
}
