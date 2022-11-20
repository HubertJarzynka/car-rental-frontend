package com.kodilla.carrentalfrontend.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RentalDto {
    private Long id;
    private LocalDate rentedFrom;
    private LocalDate rentedUntil;
    private Long carId;
    private Long userId;
}