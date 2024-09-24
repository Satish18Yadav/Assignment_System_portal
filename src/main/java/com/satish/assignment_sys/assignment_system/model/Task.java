package com.satish.assignment_sys.assignment_system.model;



import com.fasterxml.jackson.annotation.JsonTypeId;
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
    private String Description;
    private String taskName;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private Asignee asignee;
    private String Date;
    private String Priority;
}
