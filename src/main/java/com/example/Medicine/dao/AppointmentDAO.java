package com.example.Medicine.dao;

import com.example.Medicine.model.Appointment;
import com.example.Medicine.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppointmentDAO {
    @Autowired
    AppointmentRepository appointmentRepository;
    public void addAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }
    public List<Appointment> getListAppointment() {
        return appointmentRepository.findAll();
    }
    public Appointment getAppointmentDetail(Long id) {
        return appointmentRepository.getReferenceById(id);
    }
}
