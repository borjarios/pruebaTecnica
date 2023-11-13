package com.zara.zara.api.prices.domain.mapper;

import com.zara.zara.api.prices.domain.dto.PricesDto;
import com.zara.zara.api.prices.domain.entity.Prices;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PricesMapper {

    PricesDto toDto(Prices object);

    Prices toEntity(PricesDto dto);

    void updateModel(PricesDto dto, @MappingTarget Prices object);

}
