package Week7_2.Dao;

import Week7_2.Model.CurrencyConverter;
import java.sql.*;
import Week7_2.Datasource.MariaDbConnection;
import java.util.*;
public class CurrencyDao {

    public CurrencyConverter getAllCurrencies() {
        Connection conn = MariaDbConnection.getInstance();
        String sql = "SELECT abbreviation, currency_name, currency_rate FROM currency";
        CurrencyConverter converter = new CurrencyConverter();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                String abb = rs.getString(1);
                String name = rs.getString(2);
                double rate = rs.getDouble(3);
                CurrencyConverter.Currency cur = new CurrencyConverter.Currency(abb, name, rate);
                converter.add(cur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return converter;
    }
}
