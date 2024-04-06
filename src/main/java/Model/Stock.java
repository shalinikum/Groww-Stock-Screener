package Model;

import org.springframework.data.annotation.Id;

public class Stock{

    @Id
    private String companyName;

    private String companyShortName ;
    private int industryCode;
    private String searchId;

    public Stock(String companyName, String companyShortName, int industryCode, String searchId) {
        super();
        this.companyName = companyName;
        this.companyShortName = companyShortName;
        this.industryCode = industryCode;
        this.searchId = searchId;
    }
}