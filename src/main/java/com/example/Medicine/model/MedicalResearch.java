package com.example.Medicine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalResearch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameResearch;
    private Date dateOfExecution;
    private String timeOfExecution;
    private String statusResearch;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "medicalResearch_patient",
                        joinColumns = @JoinColumn(name = "patient_id", referencedColumnName = "id"),
                        inverseJoinColumns = @JoinColumn(name = "medical_research_id", referencedColumnName = "id"))
    private List<Patient> patientList;
}
