package com.nailton.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document("country")
public class Country {

    @Id
    private String id;

    private String name;

    private String capital;

    private String ddi;

    public Country() {}

    public Country(String name, String capital, String ddi) {
        this.name = name;
        this.capital = capital;
        this.ddi = ddi;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }
}
