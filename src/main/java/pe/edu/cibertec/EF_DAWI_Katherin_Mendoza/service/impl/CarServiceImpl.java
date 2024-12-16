package pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.dto.CarDto;
import pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.entity.Car;
import pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.repository.CarRepository;
import pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public List<CarDto> getAllCars() throws Exception {
        List<CarDto> cars = new ArrayList<CarDto>();
        Iterable<Car> iterable = carRepository.findAll();
        iterable.forEach(car -> {
            cars.add(new CarDto(car.getCarId(),
                    car.getMake(),
                    car.getModel(),
                    car.getYear(),
                    car.getVin(),
                    car.getLicensePlate(),
                    car.getOwnerName(),
                    car.getOwnerContact(),
                    car.getPurchaseDate(),
                    car.getMileage(),
                    car.getEngineType(),
                    car.getColor(),
                    car.getInsuranceCompany(),
                    car.getInsurancePolicyNumber(),
                    car.getRegistrationExpirationDate(),
                    car.getServiceDueDate()));
        });
        return cars;
    }

    @Override
    public Optional<CarDto> getCarById(int id) throws Exception {
        Optional<Car> optional = carRepository.findById(id);
        return optional.map(car -> new CarDto(car.getCarId(),
                car.getMake(),
                car.getModel(),
                car.getYear(),
                car.getVin(),
                car.getLicensePlate(),
                car.getOwnerName(),
                car.getOwnerContact(),
                car.getPurchaseDate(),
                car.getMileage(),
                car.getEngineType(),
                car.getColor(),
                car.getInsuranceCompany(),
                car.getInsurancePolicyNumber(),
                car.getRegistrationExpirationDate(),
                car.getServiceDueDate()));
    }

    @Override
    public boolean updateCar(CarDto carDto) throws Exception {
        Optional<Car> optional = carRepository.findById(carDto.carId());
        return optional.map(car -> {
            car.setMake(carDto.make());
            car.setModel(carDto.model());
            car.setYear(carDto.year());
            car.setVin(carDto.vin());
            car.setLicensePlate(carDto.licensePlate());
            car.setOwnerName(carDto.ownerName());
            car.setOwnerContact(carDto.ownerContact());
            car.setPurchaseDate(carDto.purchaseDate());
            car.setMileage(carDto.mileage());
            car.setEngineType(carDto.engineType());
            car.setColor(carDto.color());
            car.setInsuranceCompany(carDto.insuranceCompany());
            car.setInsurancePolicyNumber(carDto.insurancePolicyNumber());
            car.setRegistrationExpirationDate(carDto.registrationExpirationDate());
            car.setServiceDueDate(carDto.serviceDueDate());

            carRepository.save(car);
            return true;
        }).orElse(false);
    }

    @Override
    public boolean deleteCarById(Integer id) throws Exception {
        Optional<Car> optional = carRepository.findById(id);
        return optional.map(car -> {
            carRepository.delete(car);
            return true;
        }).orElse(false);
    }

    @Override
    public boolean addCar(CarDto carDto) throws Exception {
        if (carDto.carId() == null) {
            Car car = new Car();
            car.setMake(carDto.make());
            car.setModel(carDto.model());
            car.setYear(carDto.year());
            car.setVin(carDto.vin());
            car.setLicensePlate(carDto.licensePlate());
            car.setOwnerName(carDto.ownerName());
            car.setOwnerContact(carDto.ownerContact());
            car.setPurchaseDate(carDto.purchaseDate());
            car.setMileage(carDto.mileage());
            car.setEngineType(carDto.engineType());
            car.setColor(carDto.color());
            car.setInsuranceCompany(carDto.insuranceCompany());
            car.setInsurancePolicyNumber(carDto.insurancePolicyNumber());
            car.setRegistrationExpirationDate(carDto.registrationExpirationDate());
            car.setServiceDueDate(carDto.serviceDueDate());

            carRepository.save(car);
            return true;
        }
        return false;
    }
}
