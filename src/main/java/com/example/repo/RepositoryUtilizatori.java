package com.example.repo;

import com.example.domain.Utilizator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUtilizatori extends JpaRepository<Utilizator,Long> {
    //Utilizator findByName(String name);
}
