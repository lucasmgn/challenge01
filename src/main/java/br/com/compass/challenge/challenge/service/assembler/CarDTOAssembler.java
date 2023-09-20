package br.com.compass.challenge.challenge.service.assembler;

import br.com.compass.challenge.challenge.model.dto.CarRequestDTO;
import br.com.compass.challenge.challenge.model.dto.CarResponseDTO;
import br.com.compass.challenge.challenge.model.entity.Car;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarDTOAssembler {

    private final ModelMapper modelMapper;

    public CarResponseDTO toDTO(Car car){
        return modelMapper.map(car, CarResponseDTO.class);
    }

    public Car toModel(CarRequestDTO requestDTO){
        return modelMapper.map(requestDTO, Car.class);
    }
}
