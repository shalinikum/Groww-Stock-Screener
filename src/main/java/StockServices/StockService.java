package StockServices;

import Model.Stock;
import Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service("stockService")
public class  StockService {


        @Autowired(required=true)
        private StockRepository stockRepository;

        @Autowired
        private Logger logger;

        public List<Stock> listStocksByIndustry(int industryCode) {
                logger.info("Retrieving all Stock for particular industry");

                // Execute the query and find all matching entries
                List<Stock> stocks = stockRepository.findByIndustry(industryCode);

                return stocks;
        }

        public Stock getStockDetail(String name) {
                logger.info("Retrieving all Stock for particular industry");

                // Execute the query and find all matching entries
                Stock stock = stockRepository.findByName(name);

                return stock;
        }


}