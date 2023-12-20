package com.example.Medicine.dao;

import com.example.Medicine.model.Patient;
import com.example.Medicine.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDAO {
    @Autowired
    PatientRepository patientRepository;
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    public List<Patient> getListPatient() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.getReferenceById(id);
    }
}
