package Week6_4.Controller;

import Week6_4.Model.Notebook;
import Week6_4.View.NoteView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Locale;

public class NoteController {
    @FXML
    private TextField notetitle;
    @FXML
    private TextArea notecontent;
    @FXML
    private Button addbutton;
    @FXML
    private Button savebutton;
    @FXML
    private Button deletebutton;
    @FXML
    private Button selectbutton;
    @FXML
    private ChoiceBox<String> creatednotes;
    private Notebook notebook = new Notebook();
    private Notebook.Note selectednote;

    @FXML
    private void addnote() {
        Notebook.Note note = new Notebook.Note(notetitle.getText(), notecontent.getText());
        notebook.add(note);
        creatednotes.getItems().add(note.getTitle());
        notetitle.setText("");
        notecontent.setText("");
    }

    @FXML
    private void selectnote() {
        if (creatednotes.getValue() != null) {
            selectednote = notebook.get(creatednotes.getValue());
            notetitle.setText(selectednote.getTitle());
            notecontent.setText(selectednote.getContent());
            savebutton.visibleProperty().setValue(true);
            deletebutton.visibleProperty().setValue(true);
        }
    }
    @FXML
    private void savenote() {
        if (selectednote != null) {
            notebook.update(selectednote, notetitle.getText(), notecontent.getText());
            savebutton.visibleProperty().setValue(false);
            deletebutton.visibleProperty().setValue(false);
            notetitle.setText("");
            notecontent.setText("");
        }
    }
    @FXML
    private void deletenote() {
        if (selectednote != null) {
            notebook.remove(selectednote.getTitle());
            creatednotes.getItems().remove(selectednote.getTitle());
            notetitle.setText("");
            notecontent.setText("");
            savebutton.visibleProperty().setValue(false);
            deletebutton.visibleProperty().setValue(false);
        }
    }
    public static void main(String[] args) {
        NoteView.launch(NoteView.class);
    }


}
