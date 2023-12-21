package com.example.Medicine.controller;

import com.example.Medicine.model.Appointment;
import com.example.Medicine.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;
    @ModelAttribute("appointmentList")
    public List<Appointment> getAppointmentList() {
        return appointmentService.getListAppointment();
    }
    @GetMapping("/doctorAppointment")
    public String getPage() {
        return "doctor'sAppointment";
    }
    @PostMapping("/addAppointment")
    public String addDoctorAppointment(@ModelAttribute Appointment appointment) {
        appointmentService.addAppointment(appointment);
        return "redirect:/doctorAppointment";
    }
}
