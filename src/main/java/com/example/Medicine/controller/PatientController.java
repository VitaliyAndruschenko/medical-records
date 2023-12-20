package com.example.Medicine.controller;

import com.example.Medicine.model.Patient;
import com.example.Medicine.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class PatientController {
    @Autowired
    PatientService patientService;
    @ModelAttribute("patientsList")
    public List<Patient> getListPatient() {
        return patientService.getListPatient();
    }
    @GetMapping("/")
    public String getMain() {
        return "main";
    }
    @PostMapping("/addPatient")
    private String addPatient(@ModelAttribute Patient patient) {
        patientService.addPatient(patient);
        return "redirect:/";
    }

}
