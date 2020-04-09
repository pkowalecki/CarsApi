package pl.kowalecki.carsapi.service;


import org.springframework.stereotype.Service;
import pl.kowalecki.carsapi.model.Car;
import pl.kowalecki.carsapi.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements CarServiceRepo {

    CarServiceRepo carServiceRepo;

    @Override
    public List<Car> getAllCars() {
        if (carServiceRepo == null) return null;
        return carServiceRepo.getAllCars();
    }

    @Override
    public void addCar(Car car) {
        carServiceRepo.addCar(car);
    }

    @Override
    public List<Car> findAllById(Long id) {
        return carServiceRepo.findAllById(id);
    }

}
