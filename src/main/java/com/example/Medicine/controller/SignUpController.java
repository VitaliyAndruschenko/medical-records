package com.example.Medicine.controller;

import com.example.Medicine.model.Doctor;
import com.example.Medicine.model.Nurse;
import com.example.Medicine.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
    @Autowired
    private RegistrationService registrationService;
    @PostMapping("/sign-up")
    public String registrationNurse(@ModelAttribute Nurse nurse) {
        registrationService.addNurse(nurse);
        return "redirect:/login";
    }
    @PostMapping("/registrationDoctor")
    public String registrationDoctor(@ModelAttribute Doctor doctor) {
        registrationService.addDoctor(doctor);
        return "redirect:/login";
    }
}
