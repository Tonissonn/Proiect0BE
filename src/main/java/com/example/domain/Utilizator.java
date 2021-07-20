package com.example.domain;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class Utilizator{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nume")
    private String nume;
    @Column(name="password")
    private String password;
    @Column(name="salar")
    private String salar;

    public Utilizator(Long id, String nume, String password, String salar) {
        this.id = id;
        this.nume = nume;
        this.password = password;
        this.salar = salar;
    }
    public Utilizator(String nume, String password, String salar) {
        this.nume = nume;
        this.password = password;
        this.salar = salar;
    }
    public Utilizator() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalar() {
        return salar;
    }

    public void setSalar(String salar) {
        this.salar = salar;
    }

    @Override
    public String toString(){
        return "utilizator{"+"id="+id+" nume: "+nume+" salar: "+salar+"}";
    }
}
