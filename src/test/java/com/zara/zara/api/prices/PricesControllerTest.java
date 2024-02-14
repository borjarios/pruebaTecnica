package com.zara.zara.api.prices;

import com.zara.zara.utils.Data;
import com.zara.zara.utils.JsonConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PricesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("TEST 1 - Hora: 10:00 | Día: 14 | Producto: 35455 | Brand: 1 (ZARA)")
    public void getPrices1() throws Exception {
        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JsonConverter.convertToJsonString(Data.PRICES_REQUEST_1)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(Data.DTO_1.getProductId()))
                .andExpect(jsonPath("$.brandId").value(Data.DTO_1.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(Data.DTO_1.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_1.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_1.getEndDate())))
                .andExpect(jsonPath("$.price").value(Data.DTO_1.getPrice()));
    }

    @Test
    @DisplayName("TEST 2 - Hora: 16:00 | Día: 14 | Producto: 35455 | Brand: 1 (ZARA)")
    public void getPrices2() throws Exception {
        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JsonConverter.convertToJsonString(Data.PRICES_REQUEST_2)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(Data.DTO_2.getProductId()))
                .andExpect(jsonPath("$.brandId").value(Data.DTO_2.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(Data.DTO_2.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_2.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_2.getEndDate())))
                .andExpect(jsonPath("$.price").value(Data.DTO_2.getPrice()));
    }

    @Test
    @DisplayName("TEST 3 - Hora: 21:00 | Día: 14 | Producto: 35455 | Brand: 1 (ZARA)")
    public void getPrices3() throws Exception {
        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JsonConverter.convertToJsonString(Data.PRICES_REQUEST_3)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(Data.DTO_3.getProductId()))
                .andExpect(jsonPath("$.brandId").value(Data.DTO_3.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(Data.DTO_3.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_3.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_3.getEndDate())))
                .andExpect(jsonPath("$.price").value(Data.DTO_3.getPrice()));
    }

    @Test
    @DisplayName("TEST 4 - Hora: 10:00 | Día: 15 | Producto: 35455 | Brand: 1 (ZARA)")
    public void getPrices4() throws Exception {
        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JsonConverter.convertToJsonString(Data.PRICES_REQUEST_4)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(Data.DTO_4.getProductId()))
                .andExpect(jsonPath("$.brandId").value(Data.DTO_4.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(Data.DTO_4.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_4.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_4.getEndDate())))
                .andExpect(jsonPath("$.price").value(Data.DTO_4.getPrice()));
    }

    @Test
    @DisplayName("TEST 5 - Hora: 21:00 | Día: 16 | Producto: 35455 | Brand: 1 (ZARA)")
    public void getPrices5() throws Exception {
        mockMvc.perform(get("/api/prices")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(JsonConverter.convertToJsonString(Data.PRICES_REQUEST_5)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(Data.DTO_5.getProductId()))
                .andExpect(jsonPath("$.brandId").value(Data.DTO_5.getBrandId()))
                .andExpect(jsonPath("$.priceList").value(Data.DTO_5.getPriceList()))
                .andExpect(jsonPath("$.startDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_5.getStartDate())))
                .andExpect(jsonPath("$.endDate").value(JsonConverter.SIMPLE_DATE_FORMAT.format(Data.DTO_5.getEndDate())))
                .andExpect(jsonPath("$.price").value(Data.DTO_5.getPrice()));
    }

}
