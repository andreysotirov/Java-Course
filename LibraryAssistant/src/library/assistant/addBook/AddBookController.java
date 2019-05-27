package library.assistant.addBook;

import com.jfoenix.controls.*;
import database.DatabaseHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class AddBookController implements Initializable{
    DatabaseHandler databaseHandler;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        DatabaseHandler databaseHandler = new DatabaseHandler();
    }

    @FXML
    private JFXTextField title;

    @FXML
    private JFXTextField id;

    @FXML
    private JFXTextField author;

    @FXML
    private JFXTextField publisher;

    @FXML
    private JFXButton buttonSave;

    @FXML
    private JFXButton buttonCancel;


    @FXML
    void addBook(ActionEvent event) {

    }

    @FXML
    void cancel(ActionEvent event) {

    }

}
