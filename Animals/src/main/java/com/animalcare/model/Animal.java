package com.animalcare.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "Animals")
public class Animal {
    @Id
    private Long animalId;
    private AnimalCategory category;
    private String name;
    private Double age;
    private  Boolean isAvailable;
    @OneToMany(mappedBy = "imageId")
    private List<Image> images;
}
