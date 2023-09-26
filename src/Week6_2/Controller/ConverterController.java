package Week6_2.Controller;

import Week6_2.Model.CurrencyConverter;
import Week6_2.View.CurrencyView;
public class ConverterController {
    private CurrencyView view;
    private CurrencyConverter converter = new CurrencyConverter();

    public String convert(double amount, String source, String target) {
        double amountInUSD = converter.convertToUSD(amount,source);
        return converter.convertFromUSD(amountInUSD,target);
    }

}
