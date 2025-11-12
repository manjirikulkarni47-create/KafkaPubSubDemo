package com.example.KafkaPubSubDemo.service;

import com.example.KafkaPubSubDemo.models.CountryDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessageToTopic(CountryDetailsDTO countryDetailsDTO) {
		kafkaTemplate.send("NetworkTopic1",  countryDetailsDTO.getName()+"_"+countryDetailsDTO.getCapital());
	}

}
