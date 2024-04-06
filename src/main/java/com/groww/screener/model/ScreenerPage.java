package com.groww.screener.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class ScreenerPage {
    private List<List<String>> stocks;
    private List<String> index;
    private List<String> sectors;
}
