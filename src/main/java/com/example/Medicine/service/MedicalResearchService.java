package com.example.Medicine.service;

import com.example.Medicine.dao.MedicalResearchDAO;
import com.example.Medicine.dao.PatientDAO;
import com.example.Medicine.model.MedicalResearch;
import com.example.Medicine.model.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@Service
@Slf4j
public class MedicalResearchService {
    @Autowired
    MedicalResearchDAO medicalResearchDAO;
    @Autowired
    PatientDAO patientDAO;
    public void addMedicalResearch(MedicalResearch medicalResearch, String surname) {
        Patient patient = patientDAO.getPatientBySurname(surname);
        List<Patient> patients = new ArrayList<>();
        patients.add(patient);
        if (patient == null) {
            log.error("Patient is null");
        } else {
            medicalResearch.setStatusResearch(getStatus());
            medicalResearch.setPatientList(patients);
            medicalResearchDAO.addMedicalResearch(medicalResearch);
        }
    }
    public List<MedicalResearch> getListMedicalResearch() {
        return medicalResearchDAO.getListMedicalResearch();
    }
    public String getStatus() {
        Date date = new Date();
        for (MedicalResearch research : getListMedicalResearch()) {
            if (date.after(date)) {
                return "В ожидании";
            } else {
                return "Готово";
            }
        }
        return null;
    }

}
