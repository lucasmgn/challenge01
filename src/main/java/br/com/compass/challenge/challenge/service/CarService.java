package br.com.compass.challenge.challenge.service;

import br.com.compass.challenge.challenge.exception.CarNotFoundException;
import br.com.compass.challenge.challenge.model.dto.CarRequestDTO;
import br.com.compass.challenge.challenge.model.dto.CarResponseDTO;
import br.com.compass.challenge.challenge.model.entity.Car;
import br.com.compass.challenge.challenge.repository.CarRepository;
import br.com.compass.challenge.challenge.service.assembler.CarDTOAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    private final CarDTOAssembler assembler;

    public CarResponseDTO create(CarRequestDTO requestDTO) {
        var car = assembler.toModel(requestDTO);
        var carSave = carRepository.save(car);

        return assembler.toDTO(carSave);
    }

    public CarResponseDTO findBy(Long id) {
        var car = fetchOrFail(id);
        return assembler.toDTO(car);
    }

    private Car fetchOrFail(Long id) {
        return carRepository.findById(id).orElseThrow(CarNotFoundException::new);
    }
}
