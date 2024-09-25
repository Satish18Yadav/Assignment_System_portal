package com.satish.assignment_sys.assignment_system.Service;

import com.satish.assignment_sys.assignment_system.model.Users;

import java.util.List;

public interface All_the_Users {
    List<Users> UsersList();
    public Users getUserById(int id);
    public Users getUserByName(String name);

    Users createUser(String name,String password);

}
