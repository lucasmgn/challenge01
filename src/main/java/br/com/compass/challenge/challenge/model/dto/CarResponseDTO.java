package br.com.compass.challenge.challenge.model.dto;

import br.com.compass.challenge.challenge.enems.Brand;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarResponseDTO {

    private Long chassiId;

    private String model;

    private Brand brand;

    private String color;

    private String fabricationYear;
}

