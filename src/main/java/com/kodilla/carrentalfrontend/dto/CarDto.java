package com.kodilla.carrentalfrontend.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
    private Long id;
    private String vin;
    private String brand;
    private String model;
    private int productionYear;
    private int mileage;
    private String fuel;
    private BigDecimal dailyCost;
    private Status status;

}