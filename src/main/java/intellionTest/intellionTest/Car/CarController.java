package intellionTest.intellionTest.Car;


import intellionTest.intellionTest.Car.DTOs.addCarDTO;
import intellionTest.intellionTest.Car.DTOs.updateCarDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addCar")
    public ResponseEntity<addCarDTO> addUser(@RequestBody addCarDTO car){
        carService.addCar(car);
        return ResponseEntity.ok().body(car);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getCars")
    public ResponseEntity<List<Car>> getCars(){
        List<Car> cars = this.carService.getCars();
        return ResponseEntity.ok(cars);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getCar/{id}")
    public ResponseEntity<Car> getUserById(@PathVariable("id") Long id) {
        Car car = carService.getCarById(id);
        return ResponseEntity.ok().body(car);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteCar/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable("id") Long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok().build();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateCar")
    public ResponseEntity<updateCarDTO> updateCar(@RequestBody updateCarDTO car){
        carService.updateCar(car);
        return ResponseEntity.ok().body(car);
    }


}
