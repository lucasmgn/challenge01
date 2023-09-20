package br.com.compass.challenge.challenge.model.dto;

import br.com.compass.challenge.challenge.enems.Brand;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarRequestDTO {

    @NotBlank
    private String model;

    @NotNull
    private Brand brand;

    @NotBlank
    private String color;

    @NotBlank
    private String fabricationYear;
}
