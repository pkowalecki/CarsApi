package pl.kowalecki.carsapi.service;

import org.springframework.stereotype.Service;
import pl.kowalecki.carsapi.model.Car;
import pl.kowalecki.carsapi.repository.CarRepository;

import java.util.List;

@Service
public class CarServiceImpl implements  CarService{
    private CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public boolean addCar(Car car) {
        carRepository.save(car);
        return true;
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }
}
