package com.cleaning.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AviationStackClient {

    @Value("${aviationstack.endpoint.api.prod}")
    private String aviationStackEndpoint;

    @Value("${aviationstack.app.key}")
    private String aviationStackKey;


//    @Autowired
    private RestTemplate restTemplate;







}
