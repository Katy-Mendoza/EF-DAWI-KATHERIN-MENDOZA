package pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.dto.CarDto;
import pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.service.CarService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public List<CarDto> getAllCars() throws Exception {
        return carService.getAllCars();
    }

    @GetMapping("/detail/{id}")
    public Optional<CarDto> getCarById(@PathVariable("id") int id) throws Exception {
        return carService.getCarById(id);
    }

    @PutMapping("/update")
    public boolean updateCar(@RequestBody CarDto carDto) throws Exception {
        return carService.updateCar(carDto);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteCar(@PathVariable("id") int id) throws Exception {
        return carService.deleteCarById(id);
    }

    @PostMapping("/create")
    public boolean createCar(@RequestBody CarDto carDto) throws Exception {
        return carService.addCar(carDto);
    }

}
