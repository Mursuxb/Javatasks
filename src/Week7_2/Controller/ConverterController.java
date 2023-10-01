package Week7_2.Controller;

import Week7_2.Model.CurrencyConverter;
import Week7_2.View.CurrencyView;
import Week7_2.Dao.CurrencyDao;

public class ConverterController {
    private CurrencyView view;
    private CurrencyDao dao = new CurrencyDao();
    private CurrencyConverter converter = dao.getAllCurrencies();

    public String convert(double amount, String source, String target) {
        double amountInUSD = converter.convertToUSD(amount, source);
        return converter.convertFromUSD(amountInUSD, target);
    }

    public String[] getCurrencies() {
        return converter.getAbbreviations();
    }

}
