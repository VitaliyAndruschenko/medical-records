package com.example.Medicine.controller;

import com.example.Medicine.model.Nurse;
import com.example.Medicine.service.NurseService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {
    @Autowired
    private NurseService nurseService;

    @GetMapping("/sign-up")
    public String getPage() {
        return "sign-up";
    }

    @PostMapping("/sign-up")
    public String registrationNurse(@ModelAttribute Nurse nurse) {
        nurseService.addNurse(nurse);
        return "redirect:/login";
    }
}
