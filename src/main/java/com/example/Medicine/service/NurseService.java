package com.example.Medicine.service;

import com.example.Medicine.dao.NurseDAO;
import com.example.Medicine.model.Nurse;
import com.example.Medicine.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class NurseService {
    @Autowired
    NurseDAO nurseDAO;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    public void addNurse(Nurse nurse) {
        nurse.setPassword(passwordEncoder.encode(nurse.getPassword()));
        nurse.setRoles(Arrays.asList(roleRepository.findByName("ROLE_NURSE")));
        nurseDAO.addNurse(nurse);
    }
}
