package Week3_4;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class ReadCSV {

    //Tämä tehtävä on tehty ennen kuin, tajusin Omassa ilmoitetusta tiedoston muutoksesta.
    public static void main(String[] args) {
        URL CSVUrl;
        try {
            CSVUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = CSVUrl.openStream();

            InputStreamReader istreamreader = new InputStreamReader(istream);

            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            StringBuilder response = new StringBuilder();
            ArrayList<String> rows = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                if (line.split(";")[0].split(" ")[0].equals("09.09.2022")) {
                    rows.add(line);
                }
            }
            double tempSum = 0;
            int rowCount = rows.size();
            for (String row : rows) {
                String target = row.split(";")[1];
                String processed = target.replace(",", ".");
                tempSum += Double.parseDouble(processed);

            }
            System.out.println("Total of Temperatures: " + tempSum);
            System.out.println("Average Temperature: " + tempSum / rowCount + " Celsius");

            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
