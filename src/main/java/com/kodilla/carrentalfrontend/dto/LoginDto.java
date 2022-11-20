package com.kodilla.carrentalfrontend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    private String email;
    private String password;
}