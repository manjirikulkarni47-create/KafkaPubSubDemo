package com.example.KafkaPubSubDemo.models.mapper;

import com.example.KafkaPubSubDemo.models.CountryDetails;
import com.example.KafkaPubSubDemo.models.CountryDetailsDTO;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper {

    public CountryDetails mapper(String [] details){
        CountryDetails countryDetails = new CountryDetails();
        countryDetails.setName(details[0]);
        countryDetails.setCapital(details[1]);
        return countryDetails;
    }
}
