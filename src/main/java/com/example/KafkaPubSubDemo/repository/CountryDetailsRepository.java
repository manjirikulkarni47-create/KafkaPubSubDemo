package com.example.KafkaPubSubDemo.repository;

import com.example.KafkaPubSubDemo.models.CountryDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface extending CrudRepository
public interface CountryDetailsRepository
    extends CrudRepository<CountryDetails, Long> {
}