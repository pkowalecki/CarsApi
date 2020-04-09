package pl.kowalecki.carsapi.service;

import pl.kowalecki.carsapi.model.Car;

import java.util.List;

public interface CarServiceRepo {

    List<Car> getAllCars();

    void addCar(Car car);

    List<Car> findAllById(Long id);
}
