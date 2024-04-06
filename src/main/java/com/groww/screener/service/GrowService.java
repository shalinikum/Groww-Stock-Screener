package com.groww.screener.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.groww.screener.model.StockPage;
import org.json.JSONArray;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrowService {
    public List<StockPage> getAllStocks(){
        String uri = "https://groww.in/v1/api/stocks_data/v1/all_stocks";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        JSONArray jsonArray = new JSONArray(result);
        ObjectMapper objectMapper = new ObjectMapper();
        return Collections.emptyList();
    }
}
