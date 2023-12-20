package com.example.Medicine.controller;

import com.example.Medicine.model.Doctor;
import com.example.Medicine.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @GetMapping("/doctor")
    public String getDoctorPage() {
        return "doctor";
    }
    @PostMapping("/addDoctor")
    public String addDoctor(@ModelAttribute Doctor doctor) {
        doctorService.addDoctor(doctor);
        return "doctor";
    }
}
