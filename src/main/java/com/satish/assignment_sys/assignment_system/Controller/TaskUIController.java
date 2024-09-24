package com.satish.assignment_sys.assignment_system.Controller;

import com.satish.assignment_sys.assignment_system.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskUIController {


    private TaskService taskService;

    // Endpoint to render the page with all tasks
    @GetMapping("/ui/tasks")
    public String getAllTasksUI(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "tasks";  // Will resolve to 'templates/tasks.html'
    }

    // Endpoint to render the create task page
    @GetMapping("/ui/create-task")
    public String createTaskUI() {
        return "create-task";  // Will resolve to 'templates/create-task.html'
    }

}
