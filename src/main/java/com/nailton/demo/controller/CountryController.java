package com.nailton.demo.controller;

import com.nailton.demo.model.Country;
import com.nailton.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/populate")
    public String insertCountry() {
        this.countryService.insertCountry(new Country("Espanha", "Madrid", "+34"));
        this.countryService.insertCountry(new Country("Brasil", "Brasilia", "+55"));
        this.countryService.insertCountry(new Country("Argentina", "Buenos Aires", "+54"));
        return "Inserted Countries";
    }

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return this.countryService.getCountries();
    }
}
