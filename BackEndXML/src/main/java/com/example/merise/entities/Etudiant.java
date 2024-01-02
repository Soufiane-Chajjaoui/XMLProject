package com.example.merise.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Etudiant {
    private String nom;
    private String prenom;
    private String email;
    private String tele;
    private String address;
    private String filiere;
    private String sexe;
    private String regional;
    private String national;
    private String datenaiss;


}
