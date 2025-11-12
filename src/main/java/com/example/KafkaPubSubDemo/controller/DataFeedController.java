package com.example.KafkaPubSubDemo.controller;

import com.example.KafkaPubSubDemo.CountryDetailService;
import com.example.KafkaPubSubDemo.models.CountryDetails;
import com.example.KafkaPubSubDemo.models.CountryDetailsDTO;
import com.example.KafkaPubSubDemo.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest/api")
public class DataFeedController {

	@Autowired
    KafkaProducer kafkaProducer;
    
    @Autowired
    private CountryDetailService countryDetailService;


    @PostMapping(value = "/producer")
    public String publish(@RequestBody CountryDetailsDTO countryDetailsDTO)
    {
        kafkaProducer.sendMessageToTopic(countryDetailsDTO);
        return "Message sent Successfully to the your Network topic ";
    }

    @GetMapping(value = "/getAllCountryDetails")
    public List<CountryDetails> getAllCountryDetails()
    {
        return countryDetailService.getAllCountryDetails();

    }
	
}
