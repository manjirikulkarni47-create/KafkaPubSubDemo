package com.example.KafkaPubSubDemo;

import com.example.KafkaPubSubDemo.models.CountryDetails;
import com.example.KafkaPubSubDemo.repository.CountryDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryDetailService {

    @Autowired
    private CountryDetailsRepository countryDetailsRepository;

    public List<CountryDetails> getAllCountryDetails() {
        return (List<CountryDetails>) countryDetailsRepository.findAll();
    }
}
