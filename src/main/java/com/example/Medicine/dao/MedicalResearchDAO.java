package com.example.Medicine.dao;

import com.example.Medicine.model.MedicalResearch;
import com.example.Medicine.repository.MedicalResearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicalResearchDAO {
    @Autowired
    MedicalResearchRepository medicalResearchRepository;
    public void addMedicalResearch(MedicalResearch medicalResearch) {
        medicalResearchRepository.save(medicalResearch);
    }

    public List<MedicalResearch> getListMedicalResearch() {
        return medicalResearchRepository.findAll();
    }
}
