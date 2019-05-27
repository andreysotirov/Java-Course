module LibraryAssistant {
    requires javafx.controls;
    requires java.sql;
    requires javafx.fxml;
    requires com.jfoenix;
    requires Database;

    opens library.assistant.addBook;
}