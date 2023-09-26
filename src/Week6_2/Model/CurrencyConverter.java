package Week6_2.Model;

import java.util.HashMap;

public class CurrencyConverter {
    private HashMap<String, Double> rates = new HashMap<>();


    public CurrencyConverter() {
        this.rates.put("USD", 1.0);
        this.rates.put("EUR", 1.0594);
        this.rates.put("GBP", 1.2187);
        this.rates.put("SEK", 0.0902);
    }

    public double convertToUSD(double amount, String sourceCurrency) {
        return switch (sourceCurrency) {
            case "USD" -> amount;
            case "EUR" -> amount * this.rates.get("EUR");
            case "GBP" -> amount * this.rates.get("GBP");
            case "SEK" -> amount * this.rates.get("SEK");
            default -> 0.0;
        };
    }

    public String convertFromUSD(double amount, String targetCurrency) {
        return switch (targetCurrency) {
            case "USD" -> String.format("%.2f", amount) + " $";
            case "EUR" -> String.format("%.2f", amount / this.rates.get("EUR")) + " €";
            case "GBP" -> String.format("%.2f", amount / this.rates.get("GBP")) + " £";
            case "SEK" -> String.format("%.2f", amount / this.rates.get("SEK")) + " kr";
            default -> "Something went scuffed";
        };
    }
}
