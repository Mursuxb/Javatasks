package Week6_1.View;

import Controller.DictionaryController;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class DictionaryView extends Application {
    private Label result = new Label("Please insert a word to search from the dictionary. Searched word definitions will appear here as well as possible error messages.");
    private TextField wordSearch = new TextField("Word");
    private DictionaryController controller;

    public void start(Stage stage) {

        Button searchButton = new Button("Search");
        FlowPane pane = new FlowPane();

        stage.setTitle("Dictionary");

        // add outside margins for components
        Insets insets = new Insets(10, 10, 10, 10);
        pane.setMargin(result, insets);
        pane.setMargin(searchButton, insets);
        pane.setMargin(wordSearch, insets);

        // reserve space for result
        result.setMinWidth(60);
        result.setAlignment(Pos.CENTER);

        pane.getChildren().add(wordSearch);
        pane.getChildren().add(result);
        pane.getChildren().add(searchButton);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                controller.getDefinition();
            }
        });

        stage.show();
    }


    public void init() {
        controller = new DictionaryController(this);
        controller.initialize();
    }

    public String getWord() {
        return wordSearch.getText();
    }

    public void setResult(String result) {
        this.result.setText(result);
    }
}
