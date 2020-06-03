package pl.kowalecki.carsapi.service;

import org.springframework.stereotype.Service;
import pl.kowalecki.carsapi.model.Car;
import pl.kowalecki.carsapi.repository.CarRepository;

import java.util.List;
import java.util.Optional;

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
    public boolean editCar(Long id, Car newCar) {
        Optional<Car> carToEdit = carRepository.findById(id);
        if(!newCar.getMark().isEmpty())
            carToEdit.get().setMark(newCar.getMark());
        if(!newCar.getModel().isEmpty())
            carToEdit.get().setModel(newCar.getModel());
        if(!newCar.getBody().isEmpty())
            carToEdit.get().setBody(newCar.getBody());
        if(!newCar.getFuelType().isEmpty())
            carToEdit.get().setFuelType(newCar.getFuelType());
        if(newCar.getEngineCapacity() != null)
            carToEdit.get().setEngineCapacity(newCar.getEngineCapacity());
        if(newCar.getEnginePower() != null)
            carToEdit.get().setEnginePower(newCar.getEnginePower());
        if(!newCar.getProdYear().isEmpty())
            carToEdit.get().setProdYear(newCar.getProdYear());
        if(!newCar.getCountryProd().isEmpty())
            carToEdit.get().setCountryProd(newCar.getCountryProd());
        if(!newCar.getColour().isEmpty())
            carToEdit.get().setColour(newCar.getColour());
        if(!newCar.getVin().isEmpty())
            carToEdit.get().setVin(newCar.getVin());
        if(newCar.getFuelUsage() != null)
            carToEdit.get().setFuelUsage(newCar.getFuelUsage());
        if(!newCar.getGearBoxType().isEmpty())
            carToEdit.get().setGearBoxType(newCar.getGearBoxType());
        if(!newCar.getGearBoxLevel().isEmpty())
            carToEdit.get().setGearBoxLevel(newCar.getGearBoxLevel());
        if(!newCar.getServiceNeeded().isEmpty())
            carToEdit.get().setServiceNeeded(newCar.getServiceNeeded());
        carRepository.save(carToEdit.get());
        return true;

    }

    @Override
    public Car getVechicleDetails(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteCar(Long id) {
        carRepository.deleteById(id);
        return true;
    }


}
