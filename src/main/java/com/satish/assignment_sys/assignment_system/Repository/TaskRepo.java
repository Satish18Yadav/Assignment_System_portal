package com.satish.assignment_sys.assignment_system.Repository;

import com.satish.assignment_sys.assignment_system.model.Task;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;


public interface TaskRepo extends JpaRepository<Task, Integer> {

    Task findTaskById(int id);
    Task findTaskByTaskName(String taskName);

    List<Task> findTaskById(Integer Id);


    //create a Task
    Task save(Task task);

    void deleteById(int id);
}
