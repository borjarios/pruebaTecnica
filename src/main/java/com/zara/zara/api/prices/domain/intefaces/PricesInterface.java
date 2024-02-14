package com.zara.zara.api.prices.domain.intefaces;

import com.zara.zara.api.prices.domain.dto.PricesDto;
import com.zara.zara.api.prices.domain.request.PricesRequest;

public interface PricesInterface {

    PricesDto findAll(PricesRequest request);

}
