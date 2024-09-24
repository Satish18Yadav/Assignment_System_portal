package com.satish.assignment_sys.assignment_system.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Asignee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    String name;
   private String email;
   @JsonIgnore
   @OneToMany(mappedBy = "asignee", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
   List<Task> Task;
}
