package com.satish.assignment_sys.assignment_system.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("/add-task")
    public String addTaskForm() {
        return "add-task";
    }

    @GetMapping("/task-list")
    public String taskList() {
        return "task-list";
    }
}
