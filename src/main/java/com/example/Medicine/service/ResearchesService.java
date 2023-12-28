package com.example.Medicine.service;

import com.example.Medicine.dao.ResearchesDAO;
import com.example.Medicine.model.Researches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResearchesService {
    @Autowired
    ResearchesDAO researchesDAO;
    public void addResearches(Researches researches) {
        researchesDAO.addResearches(researches);
    }
    public List<Researches> getAllResearches() {
        return researchesDAO.getAllResearches();
    }
}
