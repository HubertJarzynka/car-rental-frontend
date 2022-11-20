package com.kodilla.carrentalfrontend.client;

import com.kodilla.carrentalfrontend.config.BackendAppConfig;
import com.kodilla.carrentalfrontend.dto.LoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class LoginClient {

    private final RestTemplate restTemplate;
    private final BackendAppConfig backendAppConfig;

    public Boolean isLoginRegistered(LoginDto loginDto) {
        URI url = UriComponentsBuilder.fromHttpUrl(backendAppConfig.getLoginEndpoint() + "/is_registered")
                .queryParam("email", loginDto.getEmail())
                .queryParam("password", loginDto.getPassword())
                .build().encode().toUri();
        return restTemplate.getForObject(url, Boolean.class);
    }
}
