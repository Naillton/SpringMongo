package com.nailton.demo.service;

import com.nailton.demo.model.Country;
import com.nailton.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public void insertCountry(Country country) {
        this.countryRepository.insert(country);
    }

    public List<Country> getCountries() {
        return this.countryRepository.findAll();
    }
}
