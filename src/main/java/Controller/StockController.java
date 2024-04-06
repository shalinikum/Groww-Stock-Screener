package Controller;

import Model.Stock;
import StockServices.StockService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
@AllArgsConstructor
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping("/{id}")
    public Stock getStockById(@PathVariable String id){
        return (Stock) stockService.getStockDetail(id);
    }

}
