package com.animalcare.repository;

import com.animalcare.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
    Image findByImageId(Long id);
}
