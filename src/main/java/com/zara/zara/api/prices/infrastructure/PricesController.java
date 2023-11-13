package com.zara.zara.api.prices.infrastructure;

import com.zara.zara.api.prices.application.PricesService;
import com.zara.zara.api.prices.domain.dto.PricesDto;
import com.zara.zara.api.prices.domain.request.PricesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PricesController {

    private final PricesService service;

    @Autowired
    public PricesController(PricesService service) {
        this.service = service;
    }

    @GetMapping("/prices")
    @ResponseBody
    public ResponseEntity<PricesDto> get(@RequestBody PricesRequest request) {
        PricesDto prices = service.findAll(request);
        if (prices == null) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(prices, HttpStatus.OK);
    }

}
