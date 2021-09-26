package com.animalcare.centre.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserDetail {
    @Id
    private Long id;
    private String name;
    private String email;
    private Date dateOfBirth;
    private String state;
    private String city;
    private int numberOfAnimals;
}
