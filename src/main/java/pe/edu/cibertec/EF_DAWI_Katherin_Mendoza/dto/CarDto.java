package pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.dto;

import java.time.LocalDate;

public record CarDto(Integer carId,
                     String make,
                     String model,
                     int year,
                     String vin,
                     String licensePlate,
                     String ownerName,
                     String ownerContact,
                     LocalDate purchaseDate,
                     int mileage,
                     String engineType,
                     String color,
                     String insuranceCompany,
                     String insurancePolicyNumber,
                     LocalDate registrationExpirationDate,
                     LocalDate serviceDueDate) {

}
