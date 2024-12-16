package pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.service;

import pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(Integer id) throws Exception;

    boolean addCar(CarDto carDto) throws Exception;

}
