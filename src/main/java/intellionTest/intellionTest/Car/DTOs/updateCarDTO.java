package intellionTest.intellionTest.Car.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class updateCarDTO {

        private Long id;
        private String brand;
        private String model;
        private String year;
}
