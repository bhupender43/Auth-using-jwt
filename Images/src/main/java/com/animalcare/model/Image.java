package com.animalcare.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "images")
public class Image {
    @Id
    private Long imageId;
    private String uniqueName;
    private String originalName;
}
