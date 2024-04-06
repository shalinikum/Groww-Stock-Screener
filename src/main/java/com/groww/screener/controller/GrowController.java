package com.groww.screener.controller;

import com.groww.screener.model.StockPage;
import com.groww.screener.service.GrowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController("/groww")
@AllArgsConstructor
public class GrowController {

    private final GrowService growService;

    @GetMapping("/stocks")
    public List<StockPage> getStocks(){
        return growService.getAllStocks();
    }
}
