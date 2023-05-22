package com.example.demo.fastapiGateway.controller;

import com.example.demo.fastapiGateway.service.FastApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/fastapi-connector")
public class FastApiController {

    final FastApiService fastApiService;

    @GetMapping("/fastapi-string-request")
    public void fastApiStringRequest () {
        log.info("fastapi string request");

        final String FASTAPI_REQUEST_URL = "http://localhost:8000/request-data";

        fastApiService.stringRequest(FASTAPI_REQUEST_URL);
    }

    @GetMapping("/fastapi-integer-request")
    public void fastApiIntegerRequest () {
        log.info("fastapi integer request");

        final String FASTAPI_REQUEST_URL = "http://localhost:8000/request-int-data";

        fastApiService.integerRequest(FASTAPI_REQUEST_URL);
    }
}
