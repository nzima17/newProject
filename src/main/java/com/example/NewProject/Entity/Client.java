package com.example.NewProject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "clients")
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //TODO : прочитать про IDENTITY
    @Column(name = "id_client")
    private Long idClient;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "passport_num")
    private String passportNum;
    private String login;
    private String password;
    @Column(name = "job_place")
    private String jobPlace;
    private String address;
}