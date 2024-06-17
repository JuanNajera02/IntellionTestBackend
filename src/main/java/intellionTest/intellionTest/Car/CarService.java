package intellionTest.intellionTest.Car;

import intellionTest.intellionTest.Car.DTOs.addCarDTO;
import intellionTest.intellionTest.Car.DTOs.updateCarDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;


    public void addCar(addCarDTO car) {
        Car newCar = new Car();
        newCar.setBrand(car.getBrand());
        newCar.setModel(car.getModel());
        newCar.setYear(car.getYear());
        carRepository.save(newCar);
    }


    public List<Car> getCars() {
        List<Car> cars = carRepository.findAll();
        return cars;
    }

    public Car getCarById(Long id) {
        Car car = carRepository.findById(id).get();
        return car;
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);

    }

    public Car updateCar(updateCarDTO car) {
        Optional<Car> optionalCar = carRepository.findById(car.getId());
        Car existingCar = optionalCar.get();

        existingCar.setBrand(car.getBrand());
        existingCar.setYear(car.getYear());
        existingCar.setModel(car.getModel());

        carRepository.save(existingCar);
        return existingCar;

    }

}
