package pe.edu.cibertec.EF_DAWI_Katherin_Mendoza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
//@Getter
//@Setter
@Entity
@Table(name = "car")
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Integer carId;
    private String make;
    private String model;
    private int year;
    private String vin;
    @Column(name = "license_plate")
    private String licensePlate;
    @Column(name = "owner_name")
    private String ownerName;
    @Column(name = "owner_contact")
    private String ownerContact;
    @Column(name = "purchase_date")
    private LocalDate purchaseDate;
    private int mileage;
    @Column(name = "engine_type")
    private String engineType;
    private String color;
    @Column(name = "insurance_company")
    private String insuranceCompany;
    @Column(name = "insurance_policy_number")
    private String insurancePolicyNumber;
    @Column(name = "registration_expiration_date")
    private LocalDate registrationExpirationDate;
    @Column(name = "service_due_date")
    private LocalDate serviceDueDate;

}
