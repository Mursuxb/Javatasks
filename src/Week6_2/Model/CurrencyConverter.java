package Week6_2.Model;

public class CurrencyConverter {
    private String name;
    private String abbreviation;
    private double rateToUSD;

    public CurrencyConverter(String name, String abbreviation, double rateToUSD) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.rateToUSD = rateToUSD;
    }
    public double convertToUSD(double amount) {
        return amount * this.rateToUSD;
    }
    public double convertFromUSD(double amount) {
        return amount / this.rateToUSD;
    }
    public String getName() {
        return this.name;
    }
    public String getAbbreviation() {
        return this.abbreviation;
    }
}
