package com.example.Medicine.controller;

import com.example.Medicine.model.Appointment;
import com.example.Medicine.model.Patient;
import com.example.Medicine.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppointmentDetailController {
    @Autowired
    AppointmentService appointmentService;
    @GetMapping("/appointmentDetail/{id}")
    public String getPage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("appointment", appointmentService.getAppointmentDetail(id));
        return "appointmentDetail";
    }

    @PostMapping("/updateAppointment/{id}")
    public String updateAppointment(@PathVariable("id") Long id, @ModelAttribute Appointment appointment) {
        appointmentService.updateAppointment(id, appointment);
        return "appointmentDetail";
    }
}
