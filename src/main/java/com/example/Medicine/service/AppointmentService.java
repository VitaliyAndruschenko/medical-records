package com.example.Medicine.service;

import com.example.Medicine.dao.AppointmentDAO;
import com.example.Medicine.model.Appointment;
import com.example.Medicine.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    AppointmentDAO appointmentDAO;
    public void addAppointment(Appointment appointment) {
        appointmentDAO.addAppointment(appointment);
    }
    public List<Appointment> getListAppointment() {
        return appointmentDAO.getListAppointment();
    }
    public Appointment getAppointmentDetail(Long id) {
        return appointmentDAO.getAppointmentDetail(id);
    }
    public void updateAppointment(Long id, Appointment appointment) {
        Appointment appointment1 = getAppointmentDetail(id);
        appointment.setId(appointment1.getId());
        appointmentDAO.addAppointment(appointment);
    }
}
