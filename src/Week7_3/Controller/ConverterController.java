package Week7_3.Controller;

import Week7_3.Dao.*;
import Week7_3.Model.*;
import Week7_3.View.CurrencyView;

public class ConverterController {
    private CurrencyView view;
    private CurrencyDao dao = new CurrencyDao();
    Currency.CurrencyConverter converter = new Currency.CurrencyConverter();
    public void getCurrencies(){
        Currency[] currencies = dao.findAllCurrencies();
        for (Currency currency : currencies) {
            converter.add(currency);
        }
    }
    public void createCurrency(String abbreviation, String name, double rate) {
        Currency currency = new Currency(abbreviation, name, rate);
        converter.add(currency);
        dao.persist(currency);
    }

    public String convert(double amount, String source, String target) {
        double amountInUSD = converter.convertToUSD(amount, source);
        return converter.convertFromUSD(amountInUSD, target);
    }

    public String[] getAbbreviations() {
        return dao.findAllAbbreviations();
    }

}
