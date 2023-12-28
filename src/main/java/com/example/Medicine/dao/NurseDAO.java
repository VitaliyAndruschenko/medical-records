package com.example.Medicine.dao;

import com.example.Medicine.model.Nurse;
import com.example.Medicine.repository.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NurseDAO {
    @Autowired
    NurseRepository nurseRepository;
    public void addNurse(Nurse nurse) {
        nurseRepository.save(nurse);
    }
}
