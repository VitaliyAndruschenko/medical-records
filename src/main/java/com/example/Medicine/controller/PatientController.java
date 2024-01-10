package com.example.Medicine.controller;

import com.example.Medicine.model.Patient;
import com.example.Medicine.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@Controller
public class PatientController {
    @Autowired
    PatientService patientService;
    @ModelAttribute("patientsList")
    public List<Patient> getListPatient() {
        return patientService.getListPatient();
    }
    @GetMapping("/main")
    public String getMain() {
        return "main";
    }
    @PostMapping("/addPatient")
    private String addPatient(@ModelAttribute Patient patient) {
        patientService.addPatient(patient);
        return "redirect:/main";
    }

    @GetMapping("/searchPatientBySurname")
    private String getListPatientBySurnameIsContaining(@RequestParam("search") String surname, Model model) {
        model.addAttribute("searchListBySurname", patientService.getPatientBySurnameIsContaining(surname));
        return "search";
    }

}
