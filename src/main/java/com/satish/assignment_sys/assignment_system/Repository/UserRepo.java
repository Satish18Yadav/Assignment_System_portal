package com.satish.assignment_sys.assignment_system.Repository;

import com.satish.assignment_sys.assignment_system.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<Users, Integer> {

    //create an asignee
     Users save(Users users);

    Users findByName(String name);
    Users findByEmail(String email);
    Users findById(int id);
    List<Users> findAll();


}
