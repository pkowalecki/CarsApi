package pl.kowalecki.carsapi.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kowalecki.carsapi.model.Car;
import pl.kowalecki.carsapi.service.CarService;


import java.util.List;

@RestController
@RequestMapping("/car")
public class CarApi {

    private CarService carService;

    @Autowired
    public CarApi(CarService carApi) {
        this.carService = carApi;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCars(){
    List<Car>carList=carService.getAllCars();
        if(!carList.isEmpty()) {return new ResponseEntity<>(carList, HttpStatus.ACCEPTED);}
        return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> addCar(@RequestBody Car newCar){
        if(carService.addCar(newCar)) {
            return new ResponseEntity<>(HttpStatus.ACCEPTED);}
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

    @GetMapping("/getCarById")
    public ResponseEntity<Car> getCarById(@RequestParam Long id){
        Car car = (carService.getCarById(id));
        if(car != null) {
            return new ResponseEntity<>(car, HttpStatus.FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }
}
