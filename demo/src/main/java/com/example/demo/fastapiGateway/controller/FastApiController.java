package com.example.demo.fastapiGateway.controller;

import com.example.demo.fastapiGateway.service.FastApiService;
import com.example.demo.utility.PropertyUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/fastapi-connector")
public class FastApiController {

    final private FastApiService fastApiService;
    final private PropertyUtil propertyUtil;

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

    @GetMapping("/print-property/{key}")
    public String printProperty (@PathVariable String key) {
        log.info("printProperty");

        return propertyUtil.getProperty(key);
    }

    @GetMapping("/fastapi-entity-request")
    public void fastApiEntityRequest () {
        log.info("fastapi integer request");

        final String FASTAPI_REQUEST_URL = "http://localhost:8000/request-entity-data";

        fastApiService.entityRequest(FASTAPI_REQUEST_URL);
    }
}
