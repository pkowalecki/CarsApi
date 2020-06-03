package pl.kowalecki.carsapi.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kowalecki.carsapi.model.Car;
import pl.kowalecki.carsapi.service.CarService;


import java.util.List;
import java.util.Optional;

@RestController
public class CarApi {

    private CarService carService;

    @Autowired
    public CarApi(CarService carApi) {
        this.carService = carApi;
    }

    @GetMapping("/allVechicles")
    public ResponseEntity<List<Car>> getAllCars(){
    List<Car>carList=carService.getAllCars();
        if(!carList.isEmpty()) {return new ResponseEntity<>(carList, HttpStatus.ACCEPTED);}
        return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
    }

    @PostMapping("/addCar")
    public ResponseEntity<HttpStatus> addCar(@RequestBody Car newCar){
        if(carService.addCar(newCar)) {
            return new ResponseEntity<>(HttpStatus.ACCEPTED);}
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

    @PutMapping("/editCar/{id}")
    public ResponseEntity<HttpStatus> editCar(@PathVariable Long id, @RequestBody Car newCar){
        boolean edit = carService.editCar(id, newCar);
        if(edit){
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getVechicleDetails/{id}")
    public ResponseEntity<Car> getVechicleDetails(@PathVariable Long id){
        Car car = (carService.getVechicleDetails(id));
        if(car != null) {
            return new ResponseEntity<>(car, HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/deleteCar/{id}")
    public ResponseEntity<Car> deleteCar(@PathVariable Long id){
        if(carService.deleteCar(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
