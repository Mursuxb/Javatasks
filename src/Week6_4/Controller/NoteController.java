package Week6_4.Controller;

import Week6_4.Model.Notebook;
import Week6_4.View.NoteView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    private ListView<Notebook.Note> creatednotes;
    private ObservableList<Notebook.Note> notes = FXCollections.observableArrayList();
    private Notebook notebook = new Notebook();
    private Notebook.Note selectednote;

    @FXML
    public void initialize() {
        creatednotes.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        creatednotes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                selectednote = newValue;
                notetitle.setText(newValue.getTitle());
                notecontent.setText(newValue.getContent());
                savebutton.visibleProperty().setValue(true);
                deletebutton.visibleProperty().setValue(true);
            }
        });
    }

    @FXML
    private void addnote() {
        Notebook.Note note = new Notebook.Note(notetitle.getText(), notecontent.getText());
        notebook.add(note);
        notes.add(note);
        creatednotes.setItems(notes);
        notetitle.setText("");
        notecontent.setText("");
    }

//    @FXML
//    private void selectnote() {
//        selectednote = creatednotes.getSelectionModel().getSelectedItem();
//        notetitle.setText(selectednote.getTitle());
//        notecontent.setText(selectednote.getContent());
//
//    }

    @FXML
    private void savenote() {
        if (selectednote != null) {
            Notebook.Note newNote = notebook.update(selectednote, notetitle.getText(), notecontent.getText());
            savebutton.visibleProperty().setValue(false);
            deletebutton.visibleProperty().setValue(false);
            notes.remove(selectednote);
            notes.add(newNote);
            creatednotes.setItems(notes);
            notetitle.clear();
            notecontent.clear();
        }
    }

    @FXML
    private void deletenote() {
        if (selectednote != null) {
            notebook.remove(selectednote.getTitle());
            creatednotes.getItems().remove(selectednote.getTitle());
            notetitle.setText("");
            notecontent.setText("");
            notes.remove(selectednote);
            creatednotes.setItems(notes);
            savebutton.visibleProperty().setValue(false);
            deletebutton.visibleProperty().setValue(false);
        }
    }

    public static void main(String[] args) {
        NoteView.launch(NoteView.class);
    }


}
