package com.animalcare.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserDetail {
    @Id
    private Long userId;
    private String name;
    private String email;
    private Date dateOfBirth;
    @OneToOne
    private Location location;
    private Integer numberOfAnimals;
    @OneToMany(mappedBy = "animalId")
    private List<Animal> animals;
    @OneToMany(mappedBy = "imageId")
    private  List<Image> images;
}
