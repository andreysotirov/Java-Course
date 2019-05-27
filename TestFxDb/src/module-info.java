module TestFxDb {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.derby.engine;
    requires org.apache.derby.client;

    opens library.assistant.addbook;
}