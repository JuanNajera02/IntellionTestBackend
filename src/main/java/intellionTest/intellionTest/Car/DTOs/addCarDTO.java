package intellionTest.intellionTest.Car.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class addCarDTO {

    private String brand;
    private String model;
    private String year;

}
