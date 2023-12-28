package com.example.Medicine.repository;

import com.example.Medicine.model.MedicalResearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalResearchRepository extends JpaRepository<MedicalResearch, Long> {
}
