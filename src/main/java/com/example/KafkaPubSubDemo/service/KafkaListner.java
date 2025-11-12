package com.example.KafkaPubSubDemo.service;

import com.example.KafkaPubSubDemo.models.CountryDetails;
import com.example.KafkaPubSubDemo.models.CountryDetailsDTO;
import com.example.KafkaPubSubDemo.models.mapper.CountryMapper;
import com.example.KafkaPubSubDemo.repository.CountryDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {

    @Autowired
    CountryMapper countryMapper;

    @Autowired
    CountryDetailsRepository countryDetailsRepository;

	@KafkaListener(topics = "NetworkTopic1", groupId = "Network-group1")
	public void listenToKafkaTopic(String countryCapital) {
		System.out.println("Message received is " + countryCapital);
        String [] details = countryCapital.split("_");
        CountryDetails countryDetails = countryMapper.mapper(details);
        countryDetailsRepository.save(countryDetails);
	}
}
