package Repository;

import Model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface StockRepository extends MongoRepository<Stock, String> {

        @Query("{name:'?0'}")
        Stock findByName(String name);

        @Query("{industryCode:'?0'}")
        List<Stock> findByIndustry(int industryCode);

        public long count();

}