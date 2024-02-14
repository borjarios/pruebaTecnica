package com.zara.zara.utils;

import com.zara.zara.api.prices.domain.dto.PricesDto;
import com.zara.zara.api.prices.domain.request.PricesRequest;

import java.sql.Timestamp;

public class Data {

    public static final PricesRequest PRICES_REQUEST_1 = new PricesRequest(
            Timestamp.valueOf("2020-06-14 10:00:00"),
            35455,
            1);

    public static final PricesRequest PRICES_REQUEST_2 = new PricesRequest(
            Timestamp.valueOf("2020-06-14 16:00:00"),
            35455,
            1);

    public static final PricesRequest PRICES_REQUEST_3 = new PricesRequest(
            Timestamp.valueOf("2020-06-14 21:00:00"),
            35455,
            1);

    public static final PricesRequest PRICES_REQUEST_4 = new PricesRequest(
            Timestamp.valueOf("2020-06-15 10:00:00"),
            35455,
            1);

    public static final PricesRequest PRICES_REQUEST_5 = new PricesRequest(
            Timestamp.valueOf("2020-06-16 21:00:00"),
            35455,
            1);

    public static final PricesDto DTO_1 = new PricesDto(
            35455,
            1,
            1,
            Timestamp.valueOf("2020-06-14 00:00:00"),
            Timestamp.valueOf("2020-12-31 23:59:59"),
            35.5);

    public static final PricesDto DTO_2 = new PricesDto(
            35455,
            1,
            2,
            Timestamp.valueOf("2020-06-14 15:00:00"),
            Timestamp.valueOf("2020-06-14 18:30:00"),
            25.45);

    public static final PricesDto DTO_3 = new PricesDto(
            35455,
            1,
            1,
            Timestamp.valueOf("2020-06-14 00:00:00"),
            Timestamp.valueOf("2020-12-31 23:59:59"),
            35.5);

    public static final PricesDto DTO_4 = new PricesDto(35455,
            1,
            3,
            Timestamp.valueOf("2020-06-15 00:00:00"),
            Timestamp.valueOf("2020-06-15 11:00:00"),
            30.5);

    public static final PricesDto DTO_5 = new PricesDto(
            35455,
            1,
            4,
            Timestamp.valueOf("2020-06-15 16:00:00"),
            Timestamp.valueOf("2020-12-31 23:59:59"),
            38.95);

}
