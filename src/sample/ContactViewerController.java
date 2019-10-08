package sample;

import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.GridPane;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.util.Callback;
import javafx.util.StringConverter;

import java.awt.*;

public class ContactViewerController {

    @FXML
    private ListView<String> bookListView;

    @FXML
    private GridPane coverImageView;

    @FXML
    private TextField nameInputField;

    @FXML
    private TextField surnameInputField;

    @FXML
    private TextField mailInputField;

    @FXML
    private TextField phoneNumberInput;

    @FXML
    private Button editButton;


    private final ObservableList<String> books = FXCollections.observableArrayList();

    public void initialize(){
        books.add("Orozbekov");
        books.add("Chorobaev");
        books.add("Sydykov");


        bookListView.setItems(books);

        bookListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                coverImageView.setGridLinesVisible(true);

            }
        });


            }

}