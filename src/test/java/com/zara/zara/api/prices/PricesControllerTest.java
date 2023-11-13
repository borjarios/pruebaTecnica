package com.zara.zara.api.prices;

import com.zara.zara.api.prices.domain.dto.PricesDto;
import com.zara.zara.api.prices.domain.request.PricesRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PricesControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private static SimpleDateFormat dateFormat;

    @BeforeEach
    void setup() {
        dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    }

    @Test
    public void getPrices1() throws Exception {
        PricesRequest request = new PricesRequest(Timestamp.valueOf("2020-06-14 10:00:00"), 35455, 1);
        PricesDto dto = new PricesDto(35455, 1, 1, Timestamp.valueOf("2020-06-14 00:00:00"), Timestamp.valueOf("2020-12-31 23:59:59"), 35.5);

        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(convertToJsonString(request)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(dto.getProductId()))
                .andExpect(jsonPath("$.brandId").value(dto.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(dto.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(dateFormat.format(dto.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(dateFormat.format(dto.getEndDate())))
                .andExpect(jsonPath("$.price").value(dto.getPrice()));
    }

    @Test
    public void getPrices2() throws Exception {
        PricesRequest request = new PricesRequest(Timestamp.valueOf("2020-06-14 16:00:00"), 35455, 1);
        PricesDto dto = new PricesDto(35455, 1, 2, Timestamp.valueOf("2020-06-14 15:00:00"), Timestamp.valueOf("2020-06-14 18:30:00"), 25.45);

        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(convertToJsonString(request)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(dto.getProductId()))
                .andExpect(jsonPath("$.brandId").value(dto.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(dto.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(dateFormat.format(dto.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(dateFormat.format(dto.getEndDate())))
                .andExpect(jsonPath("$.price").value(dto.getPrice()));
    }

    @Test
    public void getPrices3() throws Exception {
        PricesRequest request = new PricesRequest(Timestamp.valueOf("2020-06-14 21:00:00"), 35455, 1);
        PricesDto dto = new PricesDto(35455, 1, 1, Timestamp.valueOf("2020-06-14 00:00:00"), Timestamp.valueOf("2020-12-31 23:59:59"), 35.5);

        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(convertToJsonString(request)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(dto.getProductId()))
                .andExpect(jsonPath("$.brandId").value(dto.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(dto.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(dateFormat.format(dto.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(dateFormat.format(dto.getEndDate())))
                .andExpect(jsonPath("$.price").value(dto.getPrice()));
    }

    @Test
    public void getPrices4() throws Exception {
        PricesRequest request = new PricesRequest(Timestamp.valueOf("2020-06-15 10:00:00"), 35455, 1);
        PricesDto dto = new PricesDto(35455, 1, 3, Timestamp.valueOf("2020-06-15 00:00:00"), Timestamp.valueOf("2020-06-15 11:00:00"), 30.5);

        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(convertToJsonString(request)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(dto.getProductId()))
                .andExpect(jsonPath("$.brandId").value(dto.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(dto.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(dateFormat.format(dto.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(dateFormat.format(dto.getEndDate())))
                .andExpect(jsonPath("$.price").value(dto.getPrice()));
    }

    @Test
    public void getPrices5() throws Exception {
        PricesRequest request = new PricesRequest(Timestamp.valueOf("2020-06-16 21:00:00"), 35455, 1);
        PricesDto dto = new PricesDto(35455, 1, 4, Timestamp.valueOf("2020-06-15 16:00:00"), Timestamp.valueOf("2020-12-31 23:59:59"), 38.95);

        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(convertToJsonString(request)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(dto.getProductId()))
                .andExpect(jsonPath("$.brandId").value(dto.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(dto.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(dateFormat.format(dto.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(dateFormat.format(dto.getEndDate())))
                .andExpect(jsonPath("$.price").value(dto.getPrice()));
    }

    private static String convertToJsonString(PricesRequest request) {
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder()
                .add("date", dateFormat.format(request.getDate()))
                .add("productId", request.getProductId())
                .add("brandId", request.getBrandId());
        JsonObject jsonObject = jsonObjectBuilder.build();
        return jsonObject.toString();
    }

}
