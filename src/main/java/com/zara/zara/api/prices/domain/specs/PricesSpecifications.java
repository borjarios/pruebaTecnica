package com.zara.zara.api.prices.domain.specs;

import com.zara.zara.api.prices.domain.entity.Prices;
import com.zara.zara.api.prices.domain.request.PricesRequest;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

public class PricesSpecifications {
    public static Specification<Prices> getFilter(PricesRequest request) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicate0 = criteriaBuilder.lessThanOrEqualTo(root.get("startDate"), request.getDate());
            Predicate predicate1 = criteriaBuilder.greaterThanOrEqualTo(root.get("endDate"), request.getDate());
            Predicate predicate2 = criteriaBuilder.equal(root.get("productId"), request.getProductId());
            Predicate predicate3 = criteriaBuilder.equal(root.get("brandId"), request.getBrandId());
            query.orderBy(criteriaBuilder.desc(root.get("priority")));
            return criteriaBuilder.and(predicate0, predicate1, predicate2, predicate3);
        };
    }

}
