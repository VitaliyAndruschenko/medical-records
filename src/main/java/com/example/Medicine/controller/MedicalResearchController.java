package com.example.Medicine.controller;

import com.example.Medicine.model.MedicalResearch;
import com.example.Medicine.model.Patient;
import com.example.Medicine.service.MedicalResearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MedicalResearchController {
    @Autowired
    MedicalResearchService medicalResearchService;
    @ModelAttribute("medicalResearchList")
    public List<MedicalResearch> getMedicalResearchList() {
        return medicalResearchService.getListMedicalResearch();
    }
    @GetMapping("/medicalResearch")
    public String getMedicalResearchPage() {
        return "medicalResearch";
    }
    @PostMapping("/addMedicalResearch")
    public String addMedicalResearch(@ModelAttribute MedicalResearch medicalResearch,
                                   @RequestParam("surname")String surname) {
        medicalResearchService.addMedicalResearch(medicalResearch, surname);
        return "redirect:/medicalResearch";
    }
}
