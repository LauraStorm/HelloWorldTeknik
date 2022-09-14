package com.example.springhalloworld.model;

import javax.persistence.*;

@Entity //Når man laver Entity skal man have et ID
public class Bruger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;


    //Default constructer
    public Bruger() {
    }

    //Til at oprette et nyt objekt uden at definere et id - det bliver generet automatisk
    public Bruger(String username) {
        this.username = username;
    }

    //Til at hente hele user objektet
    public Bruger(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
