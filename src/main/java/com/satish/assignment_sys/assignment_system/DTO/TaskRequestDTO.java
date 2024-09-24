package com.satish.assignment_sys.assignment_system.DTO;


import com.satish.assignment_sys.assignment_system.model.Task;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class TaskRequestDTO {
    private Integer taskId;
    private String taskName;
    private String taskDescription;
    private String taskDate;
    private String taskPriority;


}
