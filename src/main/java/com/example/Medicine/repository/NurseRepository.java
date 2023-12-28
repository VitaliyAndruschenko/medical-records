package com.example.Medicine.repository;

import com.example.Medicine.model.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long> {
    Nurse findByEmail(String email);
    Nurse findByUsername(String username);
}
