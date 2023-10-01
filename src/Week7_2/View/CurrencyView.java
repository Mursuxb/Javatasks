package Week7_2.View;

import Week7_2.Controller.ConverterController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CurrencyView extends Application {
    private TextField conversion = new TextField("Currency conversion");
    private TextField amount = new TextField();

    private ConverterController controller = new ConverterController();

    public void start(Stage stage) {
        amount.setPromptText("Amount to convert");
        Insets insets = new Insets(5, 5, 5, 5);
        GridPane layout = new GridPane();
        Button convertButton = new Button("Convert");
        layout.setMargin(convertButton, insets);
        layout.add(convertButton, 0, 2);


        stage.setTitle("Currency Converter");
        stage.setMinWidth(600);
        stage.setMinHeight(200);


        // reserve space for result
        amount.setMinWidth(200);
        layout.add(amount, 0, 1);
        Label amountLabel = new Label("Amount");
        amountLabel.setMinWidth(200);
        layout.setMargin(amountLabel, insets);
        layout.add(amountLabel, 0, 0);
        conversion.setMinWidth(200);
        layout.setMargin(conversion, insets);
        layout.add(conversion, 2, 1);
        Label conversionLabel = new Label("Conversion");
        conversionLabel.setMinWidth(200);
        layout.setMargin(conversionLabel, insets);
        layout.add(conversionLabel, 2, 0);

        Label currencyLabel = new Label("From");
        layout.setMargin(currencyLabel, insets);
        layout.add(currencyLabel, 1, 0);
        ChoiceBox<String> sourceCurrency = new ChoiceBox<>();
        sourceCurrency.getItems().addAll(controller.getCurrencies());
        layout.setMargin(sourceCurrency, insets);
        layout.add(sourceCurrency, 1, 1);


        Label targetLabel = new Label("To");
        layout.setMargin(targetLabel, insets);
        layout.add(targetLabel, 3, 0);
        ChoiceBox<String> targetCurrency = new ChoiceBox<>();
        targetCurrency.getItems().addAll(controller.getCurrencies());
        layout.setMargin(targetCurrency, insets);
        layout.add(targetCurrency, 3, 1);
        Label directions = new Label("Please enter the amount you want to convert and select the currencies");
        Label directions2 = new Label("you want to convert from and to. Then press the convert button.");
        Label gap = new Label(" ");
        layout.add(gap, 0, 3);
        layout.add(directions, 0, 4);
        layout.add(directions2, 0, 5);


        Scene scene = new Scene(layout);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                try {
                    conversion.setText(controller.convert(Double.parseDouble(amount.getText()), sourceCurrency.getValue(), targetCurrency.getValue()));
                } catch (NumberFormatException e) {
                    conversion.setText("Please enter a number");

                }
            }
        });
        stage.show();
    }
}
