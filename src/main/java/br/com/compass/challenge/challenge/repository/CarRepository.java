package br.com.compass.challenge.challenge.repository;

import br.com.compass.challenge.challenge.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
