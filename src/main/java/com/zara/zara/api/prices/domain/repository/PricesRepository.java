package com.zara.zara.api.prices.domain.repository;

import com.zara.zara.api.prices.domain.entity.Prices;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRepository extends CrudRepository<Prices, Long>, JpaSpecificationExecutor<Prices> { }
