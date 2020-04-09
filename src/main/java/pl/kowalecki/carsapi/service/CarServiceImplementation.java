package pl.kowalecki.carsapi.service;


import org.springframework.stereotype.Service;
import pl.kowalecki.carsapi.model.Car;
import pl.kowalecki.carsapi.repository.CarRepository;

import java.util.List;

@Service
public class CarServiceImplementation implements CarService{
    CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public boolean addCar(Car car) {
    carRepository.save(car);
    return true;
    }

}
