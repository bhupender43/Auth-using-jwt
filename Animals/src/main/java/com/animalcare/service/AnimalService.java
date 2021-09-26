package com.animalcare.service;

import com.animalcare.model.Animal;
import com.animalcare.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public Animal findAnimal(Long id){
     return   animalRepository.findAnimalByAnimalId(id);
    }

    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    public void saveAnimal(Animal animal){
        animalRepository.save(animal);
    }
}
