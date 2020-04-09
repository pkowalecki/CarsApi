package pl.kowalecki.carsapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kowalecki.carsapi.model.Car;
import pl.kowalecki.carsapi.repository.CarRepository;
import pl.kowalecki.carsapi.service.CarServiceRepo;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarApi {
    CarServiceRepo carServiceRepo;

    @GetMapping("/all")
    public List<Car> getAllCars(CarServiceRepo carServiceRepo){
        return carServiceRepo.getAllCars();
    }

    @PostMapping("/add")
    public void addCar(@RequestBody Car car){
        carServiceRepo.addCar(car);
    }
}
