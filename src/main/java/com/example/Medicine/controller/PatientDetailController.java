package com.example.Medicine.controller;

import com.example.Medicine.model.Patient;
import com.example.Medicine.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PatientDetailController {

    @Autowired
    PatientService patientService;
    @GetMapping("/patientDetail/{id}")
    public String getPage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("patient", patientService.getPatientById(id));
        return "patientDetail";
    }

    @PostMapping("/updatePatient/{id}")
    public String updatePatient(@PathVariable("id") Long id, @ModelAttribute Patient patient) {
        patientService.updatePatient(id, patient);
        return "patientDetail";
    }
}
