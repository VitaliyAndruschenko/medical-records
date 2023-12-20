package com.example.Medicine.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String birthday;
    private String address;
    private String phone;
    private String numberMedicalCard;
    private String medicalHistory;
    private String maritalStatus;
    private String profession;
    private String bloodTypeAndRhFactor;
    private String informationAboutAllergicReactions;
    private String currentDiagnosis;
    private String listOfPrescribedMedications;
}
