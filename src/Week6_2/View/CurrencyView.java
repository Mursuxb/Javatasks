package Week6_2.View;

//import Week6_2.Controller.CurrencyController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class CurrencyView extends Application {
private Label conversion = new Label("Currency conversions will appear here.");
private TextField amount = new TextField("Amount to convert");
//private CurrencyController controller;
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        Button convertButton = new Button("Convert");
        FlowPane topPane = new FlowPane();
        layout.setTop(topPane);
        FlowPane bottomPane = new FlowPane();
        layout.setCenter(bottomPane);

        stage.setTitle("Currency Converter");
        stage.setMinWidth(600);
        stage.setMinHeight(200);


        // reserve space for result
        amount.setMinWidth(200);
        amount.setAlignment(Pos.CENTER_LEFT);
        Label amountLabel = new Label("Amount");
        amountLabel.setMinWidth(200);
        amountLabel.setAlignment(Pos.TOP_LEFT);
        conversion.setMinWidth(200);
        conversion.setAlignment(Pos.CENTER_RIGHT);
        Label conversionLabel = new Label("Conversion");
        conversionLabel.setMinWidth(200);
        conversionLabel.setAlignment(Pos.TOP_RIGHT);


        ChoiceBox<String> sourceCurrency = new ChoiceBox<>();
        sourceCurrency.getItems().addAll("EUR", "USD", "GBP", "SEK");


        Label currencyLabel = new Label("From");
        ChoiceBox<String> targetCurrency = new ChoiceBox<>();
        targetCurrency.getItems().addAll("EUR", "USD", "GBP", "SEK");

        Label targetLabel = new Label("To");

        // add outside margins for components
        Insets insets = new Insets(10, 10, 10, 10);
        Insets topInsets = new Insets(0, 20, 0, 10);
        topPane.setMargin(conversionLabel, topInsets);
        topPane.setMargin(currencyLabel, topInsets);
        topPane.setMargin(targetLabel, topInsets);

        bottomPane.setMargin(conversion, insets);
        bottomPane.setMargin(convertButton, insets);
        bottomPane.setMargin(amount, insets);
        bottomPane.setMargin(targetCurrency, insets);
        bottomPane.setMargin(sourceCurrency, insets);

        topPane.getChildren().add(amountLabel);
        bottomPane.getChildren().add(amount);
        bottomPane.getChildren().add(sourceCurrency);
        topPane.getChildren().add(currencyLabel);
        topPane.getChildren().add(conversionLabel);
        bottomPane.getChildren().add(conversion);
        bottomPane.getChildren().add(targetCurrency);
        topPane.getChildren().add(targetLabel);
        bottomPane.getChildren().add(convertButton);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
//                controller.getDefinition();
            }
        });

        stage.show();
    }
}
