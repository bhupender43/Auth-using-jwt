package com.animalcare.service;

import com.animalcare.model.Image;
import com.animalcare.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ImageService {
    @Autowired
    ImageRepository imageRepository;

    public Image findImage(Long id){
        return imageRepository.findByImageId(id);
    }

    public void saveImage(Image image){
        imageRepository.save(image);
    }
}
