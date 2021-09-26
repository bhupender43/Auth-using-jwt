package com.animalcare.repository;

import com.animalcare.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal,Long> {
    Animal findAnimalByAnimalId(Long id);
}
