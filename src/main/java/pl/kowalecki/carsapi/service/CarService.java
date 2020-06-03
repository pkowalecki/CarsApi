package pl.kowalecki.carsapi.service;

import pl.kowalecki.carsapi.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    boolean addCar(Car car);
    boolean editCar(Long id, Car newCar);
    Car getVechicleDetails(Long id);
    boolean deleteCar(Long id);

}
