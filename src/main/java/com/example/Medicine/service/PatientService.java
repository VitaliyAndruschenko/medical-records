package com.example.Medicine.service;

import com.example.Medicine.dao.PatientDAO;
import com.example.Medicine.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientDAO patientDAO;
    public void addPatient(Patient patient) {
        patientDAO.addPatient(patient);
    }

    public List<Patient> getListPatient() {
        return patientDAO.getListPatient();
    }

    public Patient getPatientById(Long id) {
        return patientDAO.getPatientById(id);
    }
}
