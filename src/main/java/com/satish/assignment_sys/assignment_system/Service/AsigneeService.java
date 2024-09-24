package com.satish.assignment_sys.assignment_system.Service;

import com.satish.assignment_sys.assignment_system.Repository.AsigneeRepo;
import com.satish.assignment_sys.assignment_system.model.Asignee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsigneeService implements All_the_Asignees{

    private AsigneeRepo repo;

    public AsigneeService(AsigneeRepo repo) {
        this.repo = repo;
    }

    @Override
    public Asignee getAsigneeById(int id) {
        Asignee asn = repo.findById(id);
        return asn;
    }

    public Asignee getAsigneeByName(String name) {
      Asignee asn=  repo.findByName(name);
      return asn;
    }
    public List<Asignee> asigneeList() {
        List<Asignee> asn =repo.findAll();
        return asn;
    }
}
