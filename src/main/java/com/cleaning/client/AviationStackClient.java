package com.cleaning.client;


import com.cleaning.domain.aircraft.AircraftDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class AviationStackClient {

    @Value("${aviationstack.endpoint.api.prod}")
    private String aviationStackEndpoint;

    @Value("${aviationstack.app.key}")
    private String aviationStackKey;


//    @Autowired
    private RestTemplate restTemplate;


//    public AircraftDto[] getData() {
//        URI uri = UriComponentsBuilder.fromHttpUrl(aviationStackEndpoint + "flights")
//                .queryParam("access_key", aviationStackKey)
//                .queryParam("arr_iata", "kef")
//                .queryParam("airline_name", "icelandair")
//                .queryParam("flight_status", "landed").build().encode().toUri();

//        Data data = restTemplate.getForObject(uri, Data.class);
//        return data.getAircraftDtoList();
    }
