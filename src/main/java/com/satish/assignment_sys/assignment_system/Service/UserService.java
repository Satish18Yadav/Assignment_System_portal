package com.satish.assignment_sys.assignment_system.Service;

import com.satish.assignment_sys.assignment_system.Repository.UserRepo;
import com.satish.assignment_sys.assignment_system.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements All_the_Users {

    private UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public Users getUserById(int id) {
        Users asn = repo.findById(id);
        return asn;
    }

    public Users getUserByName(String name) {
      Users asn=  repo.findByName(name);
      return asn;
    }
    public List<Users> UsersList() {
        List<Users> asn =repo.findAll();
        return asn;
    }

    public  Users createUser(String username, String password) {
        Users use = new Users();
        use.setName(username);
        use.setPassword(password);
        return repo.save(use);
    }

}
