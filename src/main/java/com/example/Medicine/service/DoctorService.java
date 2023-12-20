package com.example.Medicine.service;

import com.example.Medicine.dao.DoctorDAO;
import com.example.Medicine.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    DoctorDAO doctorDAO;
    public void addDoctor(Doctor doctor) {
        doctorDAO.addDoctor(doctor);
    }
}
