package com.example.Medicine.repository;

import com.example.Medicine.model.Researches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchesRepository extends JpaRepository<Researches, Long> {
}
