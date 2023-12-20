package com.example.Medicine.dao;

import com.example.Medicine.model.Doctor;
import com.example.Medicine.model.Patient;
import com.example.Medicine.repository.DoctorRepository;
import com.example.Medicine.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDAO {
    @Autowired
    DoctorRepository doctorRepository;
    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }
}
