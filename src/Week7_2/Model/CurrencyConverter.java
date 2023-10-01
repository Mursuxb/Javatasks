package Week7_2.Model;

import java.util.HashMap;

public class CurrencyConverter {
    private HashMap<String, Currency> rates = new HashMap<>();

    public static class Currency {
        private String abbreviation;
        private String name;
        private double rate;

        public Currency(String abbreviation, String name, double rate) {
            this.abbreviation = abbreviation;
            this.name = name;
            this.rate = rate;
        }

        public String getAbbreviation() {
            return this.abbreviation;
        }

        public String getName() {
            return this.name;
        }

        public double getRate() {
            return this.rate;
        }

    }

    public void add(Currency currency) {
        rates.put(currency.getAbbreviation(), currency);
    }

    public String[] getAbbreviations() {
        return rates.keySet().toArray(new String[0]);
    }

    public double convertToUSD(double amount, String sourceCurrency) {
        return amount * rates.get(sourceCurrency).getRate();
    }

    public String convertFromUSD(double amount, String targetCurrency) {
        return String.format("%.2f", amount / rates.get(targetCurrency).getRate()) + " " + targetCurrency;
    }
}
