package com.satish.assignment_sys.assignment_system.Service;

import com.satish.assignment_sys.assignment_system.model.Asignee;

import java.util.List;

public interface All_the_Asignees {
    List<Asignee> asigneeList();
    public  Asignee getAsigneeById(int id);
    public Asignee getAsigneeByName(String name);
}
