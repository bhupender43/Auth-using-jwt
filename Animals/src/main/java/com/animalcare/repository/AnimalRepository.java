package com.animalcare.repository;

import com.animalcare.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {
    Animal findAnimalByAnimalId(Long id);
}
