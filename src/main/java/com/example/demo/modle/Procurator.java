package com.example.demo.modle;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Procurator {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String justiceName;



    public String getJusticeName() {
        return justiceName;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setJusticeName(String justiceName) {
        this.justiceName = justiceName;
    }

    public Long getId() {
        return id;
    }

    public Procurator(String justiceName) {
        this.justiceName = justiceName;
    }
}
