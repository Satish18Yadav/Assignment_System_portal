package com.satish.assignment_sys.assignment_system.Repository;

import com.satish.assignment_sys.assignment_system.model.Asignee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AsigneeRepo extends JpaRepository<Asignee, Integer> {

    //create an asignee
     Asignee save(Asignee asignee);

    Asignee findByName(String name);
    Asignee findByEmail(String email);
    Asignee findById(int id);
    List<Asignee> findAll();

}
