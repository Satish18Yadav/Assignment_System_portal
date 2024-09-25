package com.satish.assignment_sys.assignment_system.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String taskName;
    private String Description;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private Users users;
    private String Date;
    private String Priority;
    private Integer userId;
    private String loginName;
    private String password;

    public Task(int id, String taskName, String taskDescription, String taskPriority, String taskDate) {
        this.id = id;
        this.taskName = taskName;
        this.Description = taskDescription;
        this.Priority = taskPriority;
        this.Date = taskDate;
    }


    public void setUser(Users user) {
        this.users = user;
    }
}
