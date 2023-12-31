package com.example.Medicine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String email;
    private String password;
    @ManyToMany
    @JoinTable(
            name = "doctor_roles",
            joinColumns = @JoinColumn(
                    name = "doctor_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public Doctor(String name, String surname, String username, String email, String password, Collection<Role> roles) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public Doctor(String name, String surname, String username, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Doctor() {
    }
}
