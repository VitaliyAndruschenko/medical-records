package com.example.Medicine.dao;

import com.example.Medicine.model.Researches;
import com.example.Medicine.repository.ResearchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResearchesDAO {
    @Autowired
    ResearchesRepository researchesRepository;
    public void addResearches(Researches researches) {
        researchesRepository.save(researches);
    }

    public List<Researches> getAllResearches() {
        return researchesRepository.findAll();
    }
}
