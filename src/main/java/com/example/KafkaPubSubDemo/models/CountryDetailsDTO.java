package com.example.KafkaPubSubDemo.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@NoArgsConstructor
    @AllArgsConstructor
    @Getter @Setter
    @Builder
    public class CountryDetailsDTO {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String name;
        private String capital;
    }