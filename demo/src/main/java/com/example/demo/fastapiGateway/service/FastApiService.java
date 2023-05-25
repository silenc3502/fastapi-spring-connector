package com.example.demo.fastapiGateway.service;

public interface FastApiService {
    void stringRequest(String fastapiRequestUrl);

    void integerRequest(String fastapiRequestUrl);

    void entityRequest(String fastapiRequestUrl);
}
