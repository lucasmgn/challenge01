package br.com.compass.challenge.challenge.controller;

import br.com.compass.challenge.challenge.model.dto.CarRequestDTO;
import br.com.compass.challenge.challenge.model.dto.CarResponseDTO;
import br.com.compass.challenge.challenge.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @GetMapping("/{chassiId}")
    public ResponseEntity<CarResponseDTO> getCar(@PathVariable Long chassiId){
        return ResponseEntity.ok(carService.findBy(chassiId));
    }

    @PostMapping
    public ResponseEntity<CarResponseDTO> postCar(@RequestBody @Valid CarRequestDTO requestDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.create(requestDTO));
    }
}
