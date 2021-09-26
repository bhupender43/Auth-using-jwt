package com.animalcare.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Location {
    @Id
    private Long locationId;
    private String country;
    private String state;
    private String city;
    private Double latitude;
    private Double longitude;
}
