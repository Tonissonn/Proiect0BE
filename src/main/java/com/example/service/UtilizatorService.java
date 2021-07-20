package com.example.service;

import com.example.domain.Utilizator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repo.RepositoryUtilizatori;

import java.util.List;
import java.util.Optional;

@Service
public class UtilizatorService {
    private final RepositoryUtilizatori repo;
    @Autowired
    public UtilizatorService(RepositoryUtilizatori repo){

        this.repo=repo;

    }

    public List<Utilizator> find_all(){
        return repo.findAll();
    }
    public Optional<Utilizator> find_one(Long id){
        return repo.findById(id);
    }
    public String delete(Long id){
        try {
            repo.deleteById(id);
            return "Succed!";
        }
        catch (Exception e){
            return "Failed! Utilizator inexistent";
        }
    }
    public Utilizator add(Utilizator utilizator){
        return repo.save(utilizator);
    }
    public Utilizator update(Long id, Utilizator new_user){
        repo.deleteById(id);
        return repo.save(new_user);
    }
}
