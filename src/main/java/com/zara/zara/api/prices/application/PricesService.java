package com.zara.zara.api.prices.application;

import com.zara.zara.api.prices.domain.dto.PricesDto;
import com.zara.zara.api.prices.domain.entity.Prices;
import com.zara.zara.api.prices.domain.intefaces.PricesInterface;
import com.zara.zara.api.prices.domain.mapper.PricesMapper;
import com.zara.zara.api.prices.domain.repository.PricesRepository;
import com.zara.zara.api.prices.domain.request.PricesRequest;
import com.zara.zara.api.prices.domain.specs.PricesSpecifications;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PricesService implements PricesInterface {

    private final PricesRepository repository;

    private final PricesMapper mapper;

    public PricesService(PricesRepository repository, PricesMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public PricesDto findAll(PricesRequest request) {
        List<Prices> prices = repository.findAll(PricesSpecifications.getFilter(request));
        if(prices.isEmpty()) return null;
        return mapper.toDto(prices.get(0));
    }

}
