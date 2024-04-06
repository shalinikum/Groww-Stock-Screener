package Controller;

import Model.Stock;
import StockServices.StockService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
@AllArgsConstructor
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping("/popularStocks")
    public List<Stock> getPopularStocks(){
        return (List<Stock>) stockService.getStockDetail("abc");
    }


}
