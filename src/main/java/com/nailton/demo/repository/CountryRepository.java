package com.nailton.demo.repository;

import com.nailton.demo.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CountryRepository extends MongoRepository<Country, String> {
    @Query("{name: '?0'}")
    Country findItemByName(String name);
}
