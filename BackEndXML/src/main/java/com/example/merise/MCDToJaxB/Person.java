package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.*;

public class Person {

    private String idPerson;
    private String prenom;
    private String nom;
    private String tele;
    private String email;
    private String address;
    private String sex;
    private String dateNaissance;

    public Person() {
    }

    public Person(String idPerson , String prenom, String nom, String tele, String email, String address, String sex, String dateNaissance) {
        this.idPerson = idPerson;
        this.prenom = prenom;
        this.nom = nom;
        this.tele = tele;
        this.email = email;
        this.address = address;
        this.sex = sex;
        this.dateNaissance = dateNaissance;
    }




    @XmlAttribute(name = "idPerson", required = true)
    @XmlID
    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String id) {
        this.idPerson = id;
    }


    public void setTele(String tele) {
        this.tele = tele;
    }
    @XmlElement(name = "Telephone" , required = true)
    public String getTele(){
        return  this.tele ;
    }
    @XmlElement(name = "Prenom", required = true)
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @XmlElement(name = "Nom", required = true)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    @XmlElement(name = "email", required = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "address", required = true)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlElement(name = "sex", required = true)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @XmlElement(name = "DateNaissance", required = true)
    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
