package pl.kowalecki.carsapi.service;

import pl.kowalecki.carsapi.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    boolean addCar(Car car);
}
