package com.zara.zara.utils;

import com.zara.zara.api.prices.domain.request.PricesRequest;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import java.text.SimpleDateFormat;

public class JsonConverter {

    public static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public static String convertToJsonString(PricesRequest request) {
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder()
                .add("date", SIMPLE_DATE_FORMAT.format(request.getDate()))
                .add("productId", request.getProductId())
                .add("brandId", request.getBrandId());
        JsonObject jsonObject = jsonObjectBuilder.build();
        return jsonObject.toString();
    }

}
