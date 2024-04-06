package Model;

import org.springframework.data.annotation.Id;

public class Stock{

    @Id
    private String isin;
    private String growwContractId;
    private String companyName;
    private String companyShortName;
    private String searchId;
    private int industryCode;
    private int bseScriptCode;
    private String nseScriptCode;
    private double yearlyHighPrice;
    private double yearlyLowPrice;
    private double closePrice;
    private double marketCap;

    public Stock(String isin, String growwContractId, String companyName, String companyShortName, int industryCode, String searchId, int bseScriptCode, String nseScriptCode, double yearlyHighPrice, double yearlyLowPrice, double closePrice, double marketCap) {
        super();
        this.isin = isin;
        this.growwContractId = growwContractId;
        this.companyName = companyName;
        this.companyShortName = companyShortName;
        this.industryCode = industryCode;
        this.searchId = searchId;
        this.bseScriptCode = bseScriptCode;
        this.nseScriptCode = nseScriptCode;
        this.yearlyHighPrice = yearlyHighPrice;
        this.yearlyLowPrice = yearlyLowPrice;
        this.closePrice = closePrice;
        this.marketCap = marketCap;
    }
}